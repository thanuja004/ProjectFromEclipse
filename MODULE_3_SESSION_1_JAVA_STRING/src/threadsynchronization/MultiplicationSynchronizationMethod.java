package threadsynchronization;
class Table{ 
	synchronized void printTable(int n) {
		System.out.println("PRINT MULTIPLICATION TABLE"+n);// method not synchronized //common resource 
		for(int i=1;i<=10;i++) {
			System.out.println(n+"*"+i+"="+n*i);
			try {
				Thread.sleep(400);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
class MyThreadOne extends Thread{
	
	Table t;// instance variable
	 MyThreadOne(Table t){
		 this.t=t;// to get value 
	 }
	 public void run() {
		
		 t.printTable(5);
	 }
	
}
class MyThreadTwo extends Thread{
	Table t;
	 MyThreadTwo(Table t){
		 this.t=t;
	 }
	 public void run() {
		 t.printTable(100);
		
	 }
	
}

public class MultiplicationSynchronizationMethod {

	public static void main(String[] args) {
		System.out.println("===PRINT MULTIPLICATION TABLE=====");
	Table obj=new Table();
	MyThreadOne t1=new MyThreadOne(obj);
	MyThreadTwo t2=new MyThreadTwo(obj);
	t1.start();
	t2.start();

	}

}
