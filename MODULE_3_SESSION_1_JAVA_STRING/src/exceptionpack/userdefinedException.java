package exceptionpack;

class Bank {
	double balance = -1;

	void deposit(double depositAmount, String pin) throws ArithmeticException {

		if (pin.length() > 4) {
			throw new IllegalArgumentException("PIN should not be more than 4 numbers");

		} else {

			if (balance >= 100) {
				balance += depositAmount;
			} else {
				throw new ArithmeticException("Depositing money not possible");

			}
			System.out.println("Balance : " + balance);
		}
	}

	void withdraw(double withdrawAmount, String pin) {
		if (pin.length() > 4) {
			throw new IllegalArgumentException("PIN should not be more than 4 numbers");
		} else {
			if (balance < withdrawAmount) {
				throw new ArithmeticException("Balnce is below the withdrawal amount");

			} else {
				balance -= withdrawAmount;
			}
			System.out.println("Balance : " + balance);
		}
	}
}

public class userdefinedException {

	public static void main(String[] args) {
		Bank bank = new Bank();
		try {
			try {
				bank.deposit(30.0, "1234");
				//catch (arrayoutofboundindex e)
			} catch (ArithmeticException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}finally {
				System.out.println("for more information contact:989898989 ");
			}
			try {

				bank.withdraw(50.0, "1234");
			} catch (ArithmeticException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("for more information contact:989898989 ");
		}

	}

}