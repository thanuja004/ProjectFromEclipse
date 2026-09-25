package threadpack;
class Download extends Thread{
	public void run() {
		super.run();
		for(int i=1;i<=10;i++) {
			System.out.println("Downloading in progress"+(10*i)+"%");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Downloading Completed");
		
	}
}

public class TheadExample {

	public static void main(String[] args) {
		Download download=new Download();
		download.start();
		for(int i=1;i<=10;i++) {
			System.out.println("User is using whatsapp......");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
				
			}
			
		}
		

	}

}
