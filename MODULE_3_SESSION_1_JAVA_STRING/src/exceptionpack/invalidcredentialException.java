package exceptionpack;
class InvalidCredentials extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String s;
	public InvalidCredentials(String s) {
		super(s);
		this.s=s;
	}
	public String toString() {
		return "Exception caught "+s;
	}
}

public class invalidcredentialException {
	void validateUser(int otp) throws InvalidCredentials {
		if(otp!=1234) {
			throw new  InvalidCredentials("otp mismatch");
		}else {
			System.out.println("Login successful");
		}
		
	}

	public static void main(String[] args) {
		invalidcredentialException ice=new invalidcredentialException();
		try {
			ice.validateUser(1224);
		} catch (InvalidCredentials e) {

			e.printStackTrace();
		}

	}

}
