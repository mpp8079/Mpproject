
public class retail {
	
	public static void main(String[]args){
	customer custobj1 = new customer();
	custobj1.setcustomerName("Manish");
	
	System.out.println("Customer Name  :"+custobj1.getCustomerName());
	
	customer custobj2 = new customer();
	custobj2.setcustomerName("Ram");
		
	System.out.println("Customer Name  :"+custobj2.getCustomerName());
	
	
	String s1 = new String("mak");
	String s2 = new String("MAK");
	boolean status = s1.equalsIgnoreCase(s2);
	
	System.out.println(status);	
	}
	
	
	

}
