import org.apache.log4j.Logger;
public class BankAccountDemo {
	final static Logger log = Logger.getLogger(BankAccountDemo.class);
	
	public static void main(String[]args){
		
		BankAccount mpp = new BankAccount(4220,"Shital");
		
		mpp.deposite(5000);
		mpp.deposite(8000);
		
		System.out.println("Balance is : "+mpp.getBalance());
		
		mpp.withrawe(6000);
		
		System.out.println("Balance is : "+mpp.getBalance());		
		
	}
	

}
