package threadsynchronization;

class OrderId {
	static int orderID = 1;

	static synchronized void generateOrderId() {
		orderID = orderID + 1;
		System.out.println("Order ID generated: " + orderID);
	}
}

class OtpNew {
	

	static synchronized void generateOtp() {
	
		  
		    	int min = 100000;
		    	int max = 999999;
		    	int otp = (int)(Math.random() * (max - min + 1)) + min; 
		        System.out.println("OTP generated: " + otp);
		    }
		}
	


class MyThreads extends Thread {
	public void run() {
		OrderId.generateOrderId();
		OtpNew.generateOtp();
	}
}

public class OtpGenerationSynchronized {

	public static void main(String[] args) {
		MyThreads t1 = new MyThreads();
		MyThreads t2 = new MyThreads();
		MyThreads t3 = new MyThreads();

		t1.start();
		t2.start();
		t3.start();
	}

}
