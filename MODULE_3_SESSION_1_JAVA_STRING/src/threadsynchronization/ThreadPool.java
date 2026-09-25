package threadsynchronization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Banking implements Runnable{
	private String customerName;
	private String transactionType;
	Banking(String customerName,String transactionType){
		this.customerName=customerName;
		this.transactionType=transactionType;
	}
	
	public void run() {
		System.out.println("Processing "+transactionType+" for "+customerName);
		try {
			Thread.sleep(100);
		}catch(InterruptedException e){
			e.printStackTrace();
			
		}
		System.out.println("Completed  "+transactionType+" for "+customerName+"\n"+Thread.currentThread().getName());
	}
		
	}
// 2 thread only 
		public class ThreadPool{
	public static void main(String[] args) {
		// here 4 tasks
		ExecutorService executorService=Executors.newFixedThreadPool(2);
		executorService.execute(new Banking("Thanu","Withdrawal"));
		executorService.execute(new Banking("Anu","Balance enquiry"));
		executorService.execute(new Banking("Manu","Depositing"));
		executorService.execute(new Banking("Thanu","Withdrawal"));
		executorService.shutdown();
		


		
	}

}
