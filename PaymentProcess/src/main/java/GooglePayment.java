
public class GooglePayment extends PaymentProcessingComon{
	
	
	public void shippingFree(){
		
		System.out.println(" Google Payment - shipping free ");
	}
	
	public static void main(String[]args){
		
		GooglePayment googlepayment = new GooglePayment();
		
		googlepayment.customerInfo();
		googlepayment.processCustomerInfo();
		googlepayment.sendPaymentInfoToVendor();
		googlepayment.verifyPaymentStatus();
		googlepayment.showOrderStatusToCustomer();
		googlepayment.updateDataBase();
		googlepayment.shippingFree();
	}

}
