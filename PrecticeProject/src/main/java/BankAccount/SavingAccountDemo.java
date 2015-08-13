package BankAccount;

public class SavingAccountDemo {
	
	public static void main(String[]args){
		SavingAccount Chase = new SavingAccount(1000,"Ram",10);
		
		Chase.deposite(8000);
		Chase.deposite(9000);
		
		System.out.println("Balance "+Chase.getBalance());
		
		Chase.addInerestRate();		
		
		System.out.println("Balance "+Chase.getBalance());
	}

}
