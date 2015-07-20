
public class ChasePayment extends PaymentProcessingComon {
	
	
	public void  sendEmailAndTaxMessage(){
		
		System.out.println("Send Email and Taxmessage- ChasePayment");
		
	}
	
	public static void main(String[]args){
		
		ChasePayment chasepayment = new ChasePayment();
		
		chasepayment.customerInfo();
		chasepayment.processCustomerInfo();
		chasepayment.sendPaymentInfoToVendor();
		chasepayment.verifyPaymentStatus();
		chasepayment.showOrderStatusToCustomer();
		chasepayment.updateDataBase();
		chasepayment.sendEmailAndTaxMessage();

		
		
		
	}
	

}
