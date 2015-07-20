
public class AppelPayment extends PaymentProcessingComon {
	
	
	public void discountonIphone(){
		
		System.out.println("Appel Payment - discountonIphone ");
	}
	
	
	public static void main(String[]args){
		
		AppelPayment appelpayment = new AppelPayment();
		
		appelpayment.customerInfo();
		appelpayment.processCustomerInfo();
		appelpayment.sendPaymentInfoToVendor();
		appelpayment.verifyPaymentStatus();
		appelpayment.showOrderStatusToCustomer();
		appelpayment.updateDataBase();
		appelpayment.discountonIphone();
		
		
	}

}
