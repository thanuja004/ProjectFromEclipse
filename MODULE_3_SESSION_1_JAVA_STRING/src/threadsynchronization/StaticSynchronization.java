package threadsynchronization;
class Table{
synchronized  static void printTable(int n) {
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

//Table t;// instance variable
 //MyThreadOne(Table t){
//	 this.t=t;// to get value 
 //}
 public void run() {
	
	 Table.printTable(5);
 }

}
class MyThreadTwo extends Thread{
//Table t;
// MyThreadTwo(Table t){
//	 this.t=t;
// }
 public void run() {
	 Table.printTable(100);
	
 }

}

public class  StaticSynchronization {

public static void main(String[] args) {
	System.out.println("===PRINT MULTIPLICATION TABLE=====");

MyThreadOne t1=new MyThreadOne();
MyThreadTwo t2=new MyThreadTwo();
t1.start();
t2.start();

}

}


