package threadpack;

class Yellow extends Thread{
	public void run() {
		super.run();
		System.out.println("====Signal is yellow=====\nVehicles are slowing down");
		for(int i=20;i>=1;i--) {
			System.out.println("Slow down you vehicle in :"+i+"seconds");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		}
}
	class Red extends Thread{
		public void run() {
			super.run();
			System.out.println("====Signal is red=====\n Vehicles stopped");
			for(int i=20;i>=1;i--) {
				System.out.println("Stop your vehicle \n Get ready in:"+i+"seconds");
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			}
		}
	class Green extends Thread{
		public void run() {
			super.run();
			System.out.println("=====Signal is green=====\n Start driving");
			for(int i=20;i>=1;i--) {
				System.out.println("Happy journey!!!!!!!!\nNext red signal in : "+i+"seconds");
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			}
		
		
	}

				
		
public class TrafficSignal {

	public static void main(String[] args) {
		Yellow yellow=new Yellow();
		yellow.start();
		try {
			yellow.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		Green green=new Green();
		green.start();
		try {
			green.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Red red=new Red();
		red.start();
		try {
			red.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
		

	}


