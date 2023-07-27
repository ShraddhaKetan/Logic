package micro.project;

import java.util.Scanner;

public class Test {
	Scanner scanner=new Scanner(System.in);
	MathOperations operations=new Operations();
	
	public void choiceOfOperation() {
		System.out.println("\nPlease select the opeartion \n"+ "1. Addition of two number \n" + "2. Subtraction of two number \n" + 
							"3. Multiplication of two number \n" + "4. Division of two number \n" + "5. Modulus of two number \n" +
							"6. Square of number \n" + "7. Cube of number \n"+ "8. Average of Numbers \n"+"9. Factors of Number\n" +
							"10. Find out even or odd number \n"+"0. Exit \n");
		
		int choice=scanner.nextInt();
		
		switch(choice) {
		case 1: operations.getAddition();
		choiceOfOperation();
		break;
		
		case 2: operations.getSubstraction();
		choiceOfOperation();
		break;
		
		case 3: operations.getMultiplication();
		choiceOfOperation();
		break;
		
		case 4: operations.getDivision();
		choiceOfOperation();
		break;
		
		case 5: operations.getModulus();
		choiceOfOperation();
		break;
		
		case 6: operations.getSquare();
		choiceOfOperation();
		break;
		
		case 7: operations.getCube();
		choiceOfOperation();
		break;
		
		case 8: operations.getAverage();
		choiceOfOperation();
		break;
		
		case 9: operations.getFactors();
		choiceOfOperation();
		break;
		
		case 10: operations.getEvenOdd();
		choiceOfOperation();
		break;
		
		case 0:System.out.println("Thank you for using application");
		break;
		
		default:
			System.out.println("You have chose wrong option");
			choiceOfOperation();
		}
	}
	
	
	public static void main(String[] args) {
		Test test=new Test();
		System.out.println("Welcome to the console based application ");
		test.choiceOfOperation();
	}
}
