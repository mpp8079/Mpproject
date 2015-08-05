
public class SavingAccount extends BankAccount {
	private double interestRate;
	
	
	public  SavingAccount( int accNumber, String accName,double rate){
		super(accNumber,accName);
		interestRate = rate;
		
	}

	public void addInterest(){
		double interest = getBalance()* interestRate/100;	
		this.deposite((int) interest);
	}
}

