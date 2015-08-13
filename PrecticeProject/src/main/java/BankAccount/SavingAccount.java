package BankAccount;

public class SavingAccount extends BankAccount {
	
	private double inerest;

	public SavingAccount(int accNumber, String accName,int rate) {
		super(accNumber, accName);
		inerest= rate;
	}
	
	
	public  void addInerestRate(){
		
		 double intera = getBalance()*inerest/100;
		 this.deposite(intera);
		
		
	
	
	
}
	
	
	
	

}
