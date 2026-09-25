package threadsynchronization;
class Lulu{
	 static int billNo=1000;
	// synchronized static 
	 void generateBill(String counter) {
		int temp= billNo++;
		System.out.println(""+counter+" generated BillNo "+billNo);
	    try {
		Thread.sleep(1000);
	}catch(InterruptedException e ) {
		e.printStackTrace();
	}
	   billNo = temp+1;
	   System.out.println("Bill printed in "+counter); 
	    
	    
}
}
class Counter extends Thread{
	String name;
	Lulu lulu;
	Counter(String name,Lulu lulu){
		this.name=name;
		this.lulu=lulu;
	}
	public void run() {
		//super.run();
		lulu.generateBill(name);
	}
}
public class ThreadSynchronizationExample {

	public static void main(String[] args) {
		Lulu lulu=new Lulu();
		Counter c1=new Counter("Counter 1",lulu);
		Counter c2=new Counter("Counter 2",lulu);
		Counter c3=new Counter("Counter 3",lulu);
		c1.start();
		c2.start();
		c3.start();

	}

}
