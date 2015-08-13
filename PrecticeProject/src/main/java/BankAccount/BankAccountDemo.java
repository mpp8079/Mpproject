package BankAccount;

public class BankAccountDemo {
	
	public static void main(String[]args){
		
		BankAccount ChaseObj = new BankAccount(1000,"Krish");
		
		ChaseObj.deposite(5000);
		ChaseObj.deposite(7000);
		
		System.out.println("Balance :"+ChaseObj.getBalance());
		
		ChaseObj.withdrawal(6000);
		
		System.out.println("Balance :"+ChaseObj.getBalance());
	}
	

}
