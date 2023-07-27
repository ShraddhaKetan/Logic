package micro.project;

import java.util.Scanner;

public class Operations implements MathOperations {
	Scanner scanner = new Scanner(System.in);

	public void getAddition() {
		System.out.println("\nEnter two numbers for addition ");
		int firstNo = scanner.nextInt();
		int secondNo = scanner.nextInt();
		firstNo += secondNo;
		System.out.println("Addition of two number is " + firstNo);
	}

	public void getSubstraction() {
		System.out.println("\nEnter two numbers for substraction ");
		int firstNo = scanner.nextInt();
		int secondNo = scanner.nextInt();
		firstNo -= secondNo;
		System.out.println("Substraction of two number is " + firstNo);
	}

	public void getMultiplication() {
		System.out.println("\nEnter two numbers for Multiplication ");
		int firstNo = scanner.nextInt();
		int secondNo = scanner.nextInt();
		firstNo *= secondNo;
		System.out.println("Multilpication of two number is " + firstNo);
	}

	public void getDivision() {
		System.out.println("\nEnter two numbers for Division ");
		int firstNo = scanner.nextInt();
		int secondNo = scanner.nextInt();
		firstNo /= secondNo;
		System.out.println("Division of two number is " + firstNo);
	}

	public void getAverage() {
		int addition = 0;
		float average = 0;
		System.out.println("Enter 5 numbers");
		for (int i = 1; i <= 5; i++) {
			int number = scanner.nextInt();
			addition += number;
		}
		System.out.println("Addition of 5 number is " + addition);
		average = (float) (addition / 5.0);
		System.out.println("Average: " + average);
	}

	public void getEvenOdd() {
		System.out.println("\nPlease enter the number ");
		int number = scanner.nextInt();
		if (number % 2 == 0) {
			System.out.println(number + " is even number");
		} else {
			System.out.println(number + " is odd number");
		}

	}

	public void getModulus() {
		System.out.println("\nEnter two numbers for Modulus ");
		int firstNo = scanner.nextInt();
		int secondNo = scanner.nextInt();
		firstNo %= secondNo;
		System.out.println("Modulus is " + firstNo);
	}

	public void getFactors() {
		System.out.println("\nPlease enter the number ");
		int number = scanner.nextInt();
		System.out.println("Factors of number: ");
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				System.out.println(i);
			}
		}
		
	}

	public void getSquare() {
		System.out.println("\nPlease enter the number ");
		int number = scanner.nextInt();
		number *= number;
		System.out.println("Square is " + number);
	}

	public void getCube() {
		System.out.println("\nPlease enter the number ");
		int number = scanner.nextInt();
		number *= number * number;
		System.out.println("cube is " + number);
	}

}
