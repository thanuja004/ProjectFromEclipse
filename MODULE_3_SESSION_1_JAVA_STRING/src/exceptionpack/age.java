package exceptionpack;

public class age {

	
		static void checkAge(int age) throws ArithmeticException {
			if(age<18) {
				throw new ArithmeticException("age is not valid");
			}else {
				System.out.println("you are eligible to vote");
			}
		}
        public static void main(String[] args) {
        	try {
        		checkAge(2);
        		
        	} catch(Exception e) {
        		e.printStackTrace();
        	}
        }
	}


