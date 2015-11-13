package stormintegrationtest;

import java.util.HashMap;
import java.util.Map;

import RDF.RDFTriple;
import backtype.storm.task.OutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.IRichBolt;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.tuple.Fields;
import backtype.storm.tuple.Tuple;
import backtype.storm.tuple.Values;

public class BoltSetTwo implements IRichBolt {
	private OutputCollector collector;
	Map<String, Integer> counters;

	
	@Override
	public void prepare(Map stormConf, TopologyContext context,
			OutputCollector collector) {
		
		this.counters = new HashMap<String, Integer>();
		this.collector = collector;
	}

	@Override
	public void execute(Tuple input) {
		
		String str = input.getStringByField("P");
		//String str= "hello";
		if (!counters.containsKey(str)) {
			counters.put(str, 1);
		} else {
			Integer c = counters.get(str) + 1;
			counters.put(str, c);
		}
		collector.ack(input);
	}

	@Override
	public void declareOutputFields(OutputFieldsDeclarer declarer) {
		
	}

	@Override
	public void cleanup() {
		for (Map.Entry<String, Integer> entry : counters.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	@Override
	public Map<String, Object> getComponentConfiguration() {
		return null;
	}
}
