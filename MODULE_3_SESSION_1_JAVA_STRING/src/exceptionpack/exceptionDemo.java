package exceptionpack;

public class exceptionDemo {

	public static void main(String[] args) {
		System.out.println("hi");
		try {
		int result=50/0;
		
		System.out.println("result : "+result);
		
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			//System.out.println(e);-> doent shows error exists in which line
		}
		System.out.println("thank you");

	}

}
