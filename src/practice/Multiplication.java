package practice;

import java.util.Scanner;

public class Multiplication {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number for table");
	int num=sc.nextInt();
	int r=0;
	for(int i=1;i<=10;i++) {
		r=num*i;
		System.out.println(num+"*"+i+"="+r);
	}
	
}

}