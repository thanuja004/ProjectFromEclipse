package exceptionpack;

class OrderOne implements Runnable {
	private String order;
	OrderOne(String order){
		this.order=order;
	}
	public void run() {
		System.out.println("--Your order has been picked up by our delivery agent--");
		try {
		for(int i=10;i>=1;i--) {
			System.out.println("Delivery agent has reached "+i+"km near your location");
			
				Thread.sleep(1000);
		}
			}catch(Exception e) {
				e.printStackTrace();
			}
		
		System.out.println("--Your order has been delivered by our delivery agent--");
	}
	}

class OrderTwo implements Runnable {
		private String order;
		OrderTwo(String order){
			this.order=order;
		}
		public void run() {
			System.out.println("--Your order has been picked up by our delivery agent--");
			try {
			for(int i=10;i>=1;i--) {
				System.out.println("Delivery agent has reached "+i+"km near your location ");
			//	try {
					Thread.sleep(1000);
				//}catch(Exception e) {
			}
				}catch(InterruptedException e) {
					System.out.println("Order 2 cancelled by the customer");
				}
			
			
			
		}
		}

public class DeliveryBoy {
	// public static void main(String[] args) {
	public static void main(String[] args) throws InterruptedException {
		OrderOne orderone = new OrderOne("Biriyani");
		OrderTwo ordertwo = new OrderTwo("Juice");
		Thread t1 = new Thread(orderone);
		Thread t2 = new Thread(ordertwo);
		t1.start();
		t1.join();
		t2.start();
		Thread.sleep(2000);
		System.out.println("--Customer cancelled the order--");
		t2.interrupt();
		t2.join();

	}

}
