package BankAccount;

public class BankAccount {
		private int 	accountNumber;
		private String	accountName;
		private double	balance;

		
		public BankAccount(int accNumber,String accName){
			this.accountNumber = accNumber;
			this.accountName = accName;
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
		
		public boolean deposite(double amount){
			if(amount>0){
				balance= getBalance() + amount;
				return true;
			}else 
				return false;
		}
		
		public boolean withdrawal(double amount){
			if(amount>balance){
				return false;							
			}else 
				balance= getBalance() - amount;
				return true;
		}

}
