package practice;

import java.util.Scanner;

public class Factorial {
	
	public void fact(int num) {
		int result=1;
		for(int i=1;i<=num;i++) {
			result=result*i;
		}
		System.out.println("factorial of the number is "+result);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Factorial f = new Factorial();
		System.out.println("Please Enter the number");
		int num = sc.nextInt();
		f.fact(num);

	}

}
