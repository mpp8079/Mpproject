package BankAccount;

public class ChackingAccount extends BankAccount {
	private int transactions;
	private static final int Num_Free = 3;	
	private static final double Tra_Fee = 2.0;
	
	public ChackingAccount(int accNumber, String accName) {
		super(accNumber, accName);
		transactions = 0;
	
	}
	
	public boolean deposite(double amount){
		if(super.deposite(amount)){
			transactions++;
			return true; 
		}
		return false;
		
		}
	
	public boolean withdrwal(double amount){
		if(super.deposite(amount)){
			transactions++;
			return true; 
		}
		return false;
	}
	
	public void deductFee(){
		if(transactions>Num_Free){
		double fees= Tra_Fee*(transactions -Num_Free);
		if(super.withdrawal(fees)){
			transactions =0;
		}
		
		}
	}
	
}
	
	


