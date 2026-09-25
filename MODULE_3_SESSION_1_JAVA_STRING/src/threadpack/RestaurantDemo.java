package threadpack;

class Customer extends Thread{
	 String item;

	public Customer(String item) {
		this.item = item;
	}

	public void run() {
		System.out.println("Item ordered by the customer :" + item);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println( item + " has been ordered");
	}
}

class Waiter extends Thread{
	 String item;

	Waiter(String item) {
		this.item = item;
	}

	public void run() {

		System.out.println("Waiter : received the order :" + item);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("Waiter : order :" + item + " given to chef");
		}
	}

	class Chef extends Thread {
		String item;

		public Chef(String item) {
			this.item = item;
		}

		public void run() {
			System.out.println("preparing the order :" + item);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("order :" + item + "ready to serve");
		}
	}

	// =======End of chef thread========
	public class RestaurantDemo {

		public static void main(String[] args) {
			String[] order={"Masala dosa","Biriyani","Cofee"};
			for(String orders: order);
			
				
			Customer customer=new Customer(orders);
			Waiter waiter = new Waiter(orders);
			Chef chef=new Chef(orders);
			
			customer.start();
			customer.join();
			
			waiter.start();
			waiter.join();
			
			chef.start();
			chef.join();
			System.out.println("order"+order+"Served to the customer");
			
			
		}
}
