package threadpack;

public class ThreadRun extends Thread {
	@Override
	public void run() {
		System.out.println("this code is running in a thread"+"\n"+"Thread priority : "+(Thread.currentThread().getPriority())+"\n"+(Thread.currentThread().getName()));
	
	}
	

	public static void main(String[] args) {
		ThreadRun thread=new ThreadRun();
		thread.setPriority(MAX_PRIORITY);
		ThreadRun thread2=new ThreadRun();
		thread2.setPriority(2);
		thread.start();
		thread2.start();
		System.out.println("this code is outside of thread");
		
		

	}

}
