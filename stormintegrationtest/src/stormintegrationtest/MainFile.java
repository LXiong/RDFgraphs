package stormintegrationtest;
import backtype.storm.Config;
import backtype.storm.LocalCluster;
import backtype.storm.StormSubmitter;
import backtype.storm.generated.AlreadyAliveException;
import backtype.storm.generated.InvalidTopologyException;
import backtype.storm.spout.SpoutOutputCollector;
import backtype.storm.task.OutputCollector;
import backtype.storm.task.ShellBolt;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.BasicOutputCollector;
import backtype.storm.topology.IRichBolt;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.TopologyBuilder;
import backtype.storm.topology.base.BaseBasicBolt;
import backtype.storm.topology.base.BaseRichSpout;
import backtype.storm.tuple.Fields;
import backtype.storm.tuple.Tuple;
import backtype.storm.tuple.Values;
import backtype.storm.utils.Utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class MainFile {
	
	public static BufferedReader reader;
	
	public static void main(String[] args) throws Exception{
		
		
		String filePath="./src/data/rdfdata.txt";
		File file = new File(filePath);
		reader = null;
		try{
			reader = new BufferedReader(new FileReader(file));
			stormCall();
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(reader != null){
				try{
					reader.close();
				}catch(IOException e1){
					//Do nothing
				}
			}
		}
		
		
	}
	
	public static void stormCall() throws Exception
	{
		Config config = new Config();
		config.setDebug(true);
		
		TopologyBuilder builder = new TopologyBuilder();
		
		builder.setSpout("spout", new SpoutForSentence(),3);
		builder.setBolt("spitter", new BoltSetOne(),1).shuffleGrouping("spout");
		builder.setBolt("counter", new BoltSetTwo(),1).shuffleGrouping("spitter");
		//builder.setBolt("counter", new BoltSetTwo(),1).fieldsGrouping("spitter", new Fields("P"));
		
		//builder.setBolt("spitter", new BoltWordSplitter(),3).shuffleGrouping("spout");
		//builder.setBolt("counter", new BoltWordCounter(),2).fieldsGrouping("spitter", new Fields("word"));
		
		LocalCluster cluster = new LocalCluster();
		cluster.submitTopology("WordCountStorm", config, builder.createTopology());
		Thread.sleep(10000);
		
		cluster.shutdown();
	}
	

}
