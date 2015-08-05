
public class SavingDemo {
	
	public static void main(String[]args){
		SavingAccount chase = new SavingAccount(100,"Mak",15);
		
		
		chase.deposite(5000);
		 System.out.println("Balance :"+chase.getBalance());
		 
		 
		 chase.addInterest();
		 System.out.println("Balance :"+chase.getBalance());
		 
		 chase.withrawe(5000);
		 System.out.println("Balance :"+chase.getBalance());
		 
	}

}
