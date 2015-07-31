
public class BankAccount {
	int accountNumber;
	String accountName;
	double balance;
	
	
	public BankAccount(int accNumber,String accName){
		accountNumber = accNumber;
		accountName = accName;
		balance = 0;
	}
	
	public int getAccountNumber(){
		return accountNumber;
	}
	
	public String getAccountName(){
		return accountName;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public boolean deposite(int amount){
		if(amount>0){
			balance = balance + amount;
			return true;
		}else{
			return false;
		}
	}
	
	public boolean withrawe(int amount){
		if(amount>balance){
			return false;		
		}else{
			balance = balance - amount;
		return true;
			
		}
			
	}
}
