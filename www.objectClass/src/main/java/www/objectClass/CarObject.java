package www.objectClass;

import org.apache.log4j.Logger;
public class CarObject {
	
	final static Logger log = Logger.getLogger(CarObject.class);
	
	public static void main(String[]args){
		buildDisplayToyotaSport();
		buildDisplayToyotaSand();
	}
		
		public static void buildDisplayToyotaSport(){
			car toyotaSprotcar = new car();
			toyotaSprotcar.build("Camary","Powr",4,6);
			toyotaSprotcar.carInforamtion();
			
			
		}
		
		public static void buildDisplayToyotaSand(){
			car toyotaSedan = new car();
			toyotaSedan.build("RV4","Powr",6,8);
			toyotaSedan.carInforamtion();	
	
		
	}

}
