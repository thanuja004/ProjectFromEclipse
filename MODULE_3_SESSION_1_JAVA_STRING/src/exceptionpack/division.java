package exceptionpack;

import java.util.Scanner;

public class division {
	static int checkdivision(int a, int b) throws ArithmeticException {

		if (b == 0) {
			throw new ArithmeticException("Division not possible");
		} else {
			return a / b;
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a;
		int b;
		int[] array = new int[5];
		int index;

		System.out.println("enter A");
		a = scanner.nextInt();
		System.out.println("enter B");
		b = scanner.nextInt();
		int result=checkdivision(a,b);
		System.out.println("Enter index");
		index = scanner.nextInt();
		if(index > array.length-1) {
			throw new ArithmeticException("Index out of bound");
		}else {
			array[index]=result;
		}
		System.out.println("Result is : "+array[index]);

	}

}
