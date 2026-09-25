package exceptionpack;

import java.util.Scanner;

class InvalidCredentialss extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String s;

	public InvalidCredentialss(String s) {
		super(s);
		this.s = s;
	}

	public String toString() {
		return "Exception caught " + s;
	}
}

public class EmailPasswordException {
	void validateUser(int otp) throws InvalidCredentials {
		if (otp != 1234) {
			throw new InvalidCredentials("otp mismatch");
		} else {
			System.out.println("Login sucessful");

		}
	}

	void emailValidation(String email, String password) throws InvalidCredentials {
		if (email.endsWith("@gmail.com"))  {
			if(password.length()>5) {
				System.out.println("Login sucessful");

			}	else {
				throw new InvalidCredentials("invalid credentials");

			}
		} else {
			throw new InvalidCredentials("invalid credentials");
		}

	}
	


	public static void main(String[] args) {
		String email;
		String password;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your email");
		email = scanner.next();
		System.out.println("Enter your password");
		password = scanner.next();
		try {
			emailPasswordException ep=new emailPasswordException();
			ep.validateUser(1234);
			ep.emailValidation(email,password);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
