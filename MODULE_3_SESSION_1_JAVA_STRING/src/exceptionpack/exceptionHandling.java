package exceptionpack;

public class exceptionHandling { 
	void display() {
		System.out.println("exception data1");
		int data;
		data=50/0;
		System.out.println("exception data2");
		System.out.println(data);
	}
	void print() {
		System.out.println("exception handling");
		display();
		
	}
	void test() {
		try {

			System.out.println("exception handled1");
			print();
		}catch(Exception e) {

			System.out.println("exception handled2");
			System.out.println("exception handled3");
		}
	
	}

	public static void main(String[] args) {
		 exceptionHandling obj= new  exceptionHandling();
		 obj.test();
		 System.out.println("normal flow");
		

	}

}
