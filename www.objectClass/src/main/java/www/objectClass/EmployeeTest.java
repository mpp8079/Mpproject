package www.objectClass;
import java.io.*;
import org.apache.log4j.Logger;

public class EmployeeTest {
	
	final static Logger log = Logger.getLogger(EmployeeTest.class);
	
	public static void main(String[]args){
		Employee empone = new Employee("Jame Smith");
		Employee emptwo = new Employee("Lupe Cotosh");
		
		
		empone.empage(25);
		empone.empdesignation("Senior Software Manager");
		empone.empsalary(50000.50);
		log.trace("Trace Massage ");
		log.debug("Debug Message");
		log.info("Info Message");
		log.warn("Warn Message");
		log.error("Error Message");
		
		
		
		
		emptwo.empage(30);
		emptwo.empdesignation("Software Engineer");
		emptwo.empsalary(40000.80);
		log.trace("Trace Massage ");
		log.debug("Debug Message");
		log.info("Info Message");
		log.warn("Warn Message");
		log.error("Error Message");
		
	}

}
