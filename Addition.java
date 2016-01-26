package mathMethod;

import org.apache.log4j.Logger;
// this project showing addition
public class Addition {
	
	final static Logger log = Logger.getLogger(Addition.class);
	
	public static void main(String[]args){
		int a = 15;
		int b = 20;
		int d =a+b;
	
		log.trace("Trace Message");
		log.debug("Debug Message");
		log.info("Info Message");
		log.warn("Warn Message");
		log.error("Error Message");
	}
	
	

}
