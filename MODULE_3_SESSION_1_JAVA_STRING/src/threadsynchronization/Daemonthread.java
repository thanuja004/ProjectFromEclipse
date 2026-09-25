package threadsynchronization;

public class Daemonthread extends Thread {
	public Daemonthread(String name) {
		super(name);
		
	}
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println((getName()+" is Daemon thread"));
		}else {
			System.out.println(getName()+" is user thread");
		}
	}

	public static void main(String[] args) {
		Daemonthread thread1=new Daemonthread("thread 1");
		Daemonthread thread2=new Daemonthread("thread 2");
		// setting thread 1 to daemon
		thread1.setDaemon(true);
		//starting first 2 threads
		thread1.start();
		thread2.start();
		
		// priority

	}

}
