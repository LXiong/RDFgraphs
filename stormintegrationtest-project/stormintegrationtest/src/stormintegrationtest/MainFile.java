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

import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class MainFile {
	
	public static void main(String[] args) throws Exception{
		Config config = new Config();
		config.setDebug(true);
		
		TopologyBuilder builder = new TopologyBuilder();
		builder.setSpout("spout", new SpoutForSentence(),1);
		builder.setBolt("spitter", new BoltWordSplitter(),1).shuffleGrouping("spout");
		builder.setBolt("counter", new BoltWordCounter(),1).fieldsGrouping("spitter", new Fields("word"));
		
		LocalCluster cluster = new LocalCluster();
		cluster.submitTopology("WordCountStorm", config, builder.createTopology());
		Thread.sleep(10000);
		
		cluster.shutdown();
	}
	

}
