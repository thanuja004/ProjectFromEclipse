package threadsynchronization;


		class Lulu{
			 static int billNo=1000;
		static 	void generateBill(String counter) {
				billNo++;
				System.out.println(""+counter+" generated BillNo "+billNo);
			    try {
				Thread.sleep(1000);
			}catch(InterruptedException e ) {
				e.printStackTrace();
			}
			   System.out.println("Bill printed in "+counter); 
			    
			    
		}
		}
		class Counter extends Thread{
			String name;
			//Lulu lulu;
			Counter(String name){
				this.name=name;
				//this.lulu=lulu;
			}
			public void run() {
				//super.run();
				//lulu.generateBill(name);
				Lulu.generateBill(name);
			}
		}
		public class ThreadSyncExample {

			public static void main(String[] args) {
				//Lulu lulu=new Lulu();
				Counter c1=new Counter("Counter 1");
				Counter c2=new Counter("Counter 2");
				Counter c3=new Counter("Counter 3");
				c1.start();
				c2.start();
				c3.start();

			}

		}



