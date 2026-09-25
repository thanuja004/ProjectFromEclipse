package exceptionpack;

 class RunnableNew implements Runnable {
	
	public void run() {
		System.out.println("Task is running");
		
	}
}
public class RunnableDemo{
	public static void main(String[] args) {
		RunnableNew rn=new RunnableNew();
		Thread t1=new Thread(rn);
		Thread t2=new Thread(rn);
		//rn.start();
		t1.start();
		t2.start();
		System.out.println(t1.currentThread().getName());
		System.out.println(t2.currentThread().getName());
		

	}

}

