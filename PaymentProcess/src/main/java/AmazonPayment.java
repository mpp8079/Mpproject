import org.apache.log4j.Logger;

public class AmazonPayment extends PaymentProcessingComon {
	
	final static Logger log = Logger.getLogger(AmazonPayment.class);
	
	
	
	
	public void sendEmailCustomer(){
		
		System.out.println("AmazonPayment -sendEmailCustomer ");
		
	}
	
	public static void main(String[]args){
		
		AmazonPayment amazonpayment = new AmazonPayment();
		
		amazonpayment.customerInfo();
		amazonpayment.processCustomerInfo();
		amazonpayment.sendPaymentInfoToVendor();
		amazonpayment.verifyPaymentStatus();
		amazonpayment.showOrderStatusToCustomer();
		amazonpayment.updateDataBase();
		amazonpayment.sendEmailCustomer();
	
		
	}
	
	
	
	
	
		
	}
	
	
	
	


