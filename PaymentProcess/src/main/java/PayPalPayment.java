
public class PayPalPayment extends PaymentProcessingComon {
	
	
	public void getpoints(){
		
		System.out.println("Paypalpayment - Get Points");
		
	}
	
	public static void main(String[]args){
		
		PayPalPayment paypalpayment = new PayPalPayment();
		
		paypalpayment.customerInfo();
		paypalpayment.processCustomerInfo();
		paypalpayment.sendPaymentInfoToVendor();
		paypalpayment.verifyPaymentStatus();
		paypalpayment.showOrderStatusToCustomer();
		paypalpayment.updateDataBase();
		paypalpayment.getpoints();
		
		
	}

}
