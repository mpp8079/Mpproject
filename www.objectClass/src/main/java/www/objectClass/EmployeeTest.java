package www.objectClass;
import java.io.*;

public class EmployeeTest {
	
	public static void main(String[]args){
		Employee empone = new Employee("Jame Smith");
		Employee emptwo = new Employee("Lupe Cotosh");
		
		
		empone.empage(25);
		empone.empdesignation("Senior Software Manager");
		empone.empsalary(50000.50);
		empone.Employeeinformation();
		
		
		emptwo.empage(30);
		emptwo.empdesignation("Software Engineer");
		emptwo.empsalary(40000.80);
		emptwo.Employeeinformation();	
		
		
	}

}
