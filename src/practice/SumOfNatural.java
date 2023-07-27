package practice;

import java.util.Scanner;

public class SumOfNatural {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number");
		int num=sc.nextInt();
		int result=0;
	
		 for(int i=1;i<=num;i++) {
			 result=result+i;
		 }
		 
		 System.out.println("Sum of nautral number is "+result);
	}
}
