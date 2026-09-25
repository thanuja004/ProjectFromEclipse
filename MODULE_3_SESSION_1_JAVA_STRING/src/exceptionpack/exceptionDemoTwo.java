package exceptionpack;

public class exceptionDemoTwo {

	public static void main(String[] args) {
	System.out.println("hi");
	/*try {
	 int result=10/0;
	 System.out.println("result : " +result);
	 int[] array= {1,2,3,4};
	 System.out.println("Elments " +array[5]);
	 
	 }
	catch(ArithmeticException e){
		e.printStackTrace();
	}catch(ArrayIndexOutOfBoundsException e){
		e.printStackTrace();
	}catch(Exception e) {
		e.printStackTrace();
	}
	System.out.println("hello");*/
	try {
		 try {
		 int result=10/0;
		 System.out.println("result : " +result);
		 }catch(ArithmeticException e){
				e.printStackTrace();
			}
		 int[] array= {1,2,3,4};
		 System.out.println("Elments " +array[5]);
	     }catch(ArrayIndexOutOfBoundsException e){
		e.printStackTrace();
		 
		 }
		 catch(Exception e) {
			e.printStackTrace();
		}
	System.out.println("hello");
		
		
	}

	}


