package BankAccount;

public class ChackingAccountDemo {
	
	public static void main(String[]args){
	
	ChackingAccount harri = new ChackingAccount(10000,"Manish");
	
	harri.deposite(500);
	harri.withdrwal(500);
	harri.deposite(500);
	
	
	harri.deductFee();
	
	System.out.println("Transactions <= 3"+harri.getBalance());
	
	harri.deposite(500);
	
	harri.deductFee();
	
	System.out.println("Transactions > 3"+harri.getBalance());
	
	
	}
	

	

}
