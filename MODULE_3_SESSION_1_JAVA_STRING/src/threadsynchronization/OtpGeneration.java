package threadsynchronization;


	class Order {
	    static int orderId = 100;

	    static synchronized void generateOrderId() {
	        orderId = orderId + 1;
	        System.out.println("Order ID generated: " + orderId);
	    }
	}

	class Otp {
	    static synchronized void generateOtp() {
	    	int min = 100000;
	    	int max = 999999;
	    	int otp = (int)(Math.random() * (max - min + 1)) + min; 
	        System.out.println("OTP generated: " + otp);
	    }
	}

	class MyThread extends Thread {
	    public void run() {
	        Order.generateOrderId();
	        Otp.generateOtp();
	    }
	}

	public class OtpGeneration {
	    public static void main(String[] args) {
	        MyThread t1 = new MyThread();
	       // MyThread t2 = new MyThread();
	       // MyThread t3 = new MyThread();

	        t1.start();
	      //  t2.start();
	       // t3.start();
	    }
	}
