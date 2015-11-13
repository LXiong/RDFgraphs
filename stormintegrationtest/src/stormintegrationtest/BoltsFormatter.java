package stormintegrationtest;

import java.util.Map;

import RDF.RDFTriple;
import backtype.storm.task.OutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.IRichBolt;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.tuple.Fields;
import backtype.storm.tuple.Tuple;
import backtype.storm.tuple.Values;

public class BoltsFormatter implements IRichBolt {
	private OutputCollector collector;

	@Override
	public void prepare(Map stormConf, TopologyContext context,
			OutputCollector collector) {
		this.collector = collector;
	}

	@Override
	public void execute(Tuple input) {
		
		String rawTuple = input.getString(0);
		String parts[] = rawTuple.split(" +");
		String Subject = parts[0];				
		String Predicate = parts[1];
		String Object = parts[2];
		
		RDFTriple rdf = new RDFTriple(Subject, Predicate, Object);
		rdf.setSubject(Subject);
		rdf.setPredicate(Predicate);
		rdf.setObject(Object);
		
		collector.emit(new Values(Subject, Predicate, Object));
		collector.ack(input);
	}

	@Override
	public void declareOutputFields(OutputFieldsDeclarer declarer) {
		declarer.declare(new Fields("Subject","Predicate","Object"));
	}

	@Override
	public void cleanup() {
	}

	@Override
	public Map<String, Object> getComponentConfiguration() {
		return null;
	}
}
