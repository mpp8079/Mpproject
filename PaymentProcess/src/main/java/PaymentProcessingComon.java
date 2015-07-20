
public class PaymentProcessingComon {
	
	
	public void customerInfo(){
		int cusId;
		String cusName;
		String cusAddress;
		int cusTelephone;
		
		System.out.println("PaymentProccessing - customerInfo");
	}
	
	public void processCustomerInfo(){
		int cusOrderNo;
		double cusOrderAmount;
		String orderShippingInfo;
		System.out.println("PaymentProccessing - processCustomerInfo");
		
	}
	
	public void sendPaymentInfoToVendor(){
		int cusOrderId;
		double amount;
		
		System.out.println("PaymentProccessing - sendPaymentInfoToVendor");
	}
	
	
	public void verifyPaymentStatus(){
		
		String statusMessage;
		System.out.println("PaymentProccessing - verifyPaymentStatus");
		
		
	}
	
	public void showOrderStatusToCustomer(){
		int OrderId;
		String message;
		System.out.println("PaymentProccessing - showOrderStatusToCustomer");
		
	}
	
	public void updateDataBase(){
		int orderId;
		double dateTime;
		System.out.println("PaymentProccessing - updateDataBase");
		
	}
	
	public static void main(String[]args){
		
		PaymentProcessingComon paymentprocess = new PaymentProcessingComon();
		
		paymentprocess.customerInfo();
		paymentprocess.processCustomerInfo();
		paymentprocess.sendPaymentInfoToVendor();
		paymentprocess.verifyPaymentStatus();
		paymentprocess.showOrderStatusToCustomer();
		paymentprocess.updateDataBase();
		}
		
	}


