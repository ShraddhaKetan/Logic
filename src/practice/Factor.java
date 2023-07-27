package practice;

import java.util.Scanner;

public class Factor {
	
	public void fact(int num) {
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
	}
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Factor f=new Factor();
	System.out.println("Please enter the number");
	int num=sc.nextInt();
	f.fact(num);

}
}
