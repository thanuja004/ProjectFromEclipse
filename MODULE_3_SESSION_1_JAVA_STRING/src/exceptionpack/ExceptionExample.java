package exceptionpack;

 class Luminar extends Thread{
	public void run() {
		super.run();
		while(true) {
			System.out.println("Luminar");
			try {
			
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
				
			}
		}
 class Kochi extends Thread{
	 public void run() {
			super.run();
			while(true) {
				System.out.println("kochi");
				try {
				
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
					
				}
			}
	 
	public class ExceptionExample{

	public static void main(String[] args) {
		Luminar luminar=new Luminar();
		luminar.start();		
		/*try {
			
			luminar.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		Kochi kochi=new Kochi();
		kochi.start();		
		/*try {
			
			kochi.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		
	}
		
		
		

	}

