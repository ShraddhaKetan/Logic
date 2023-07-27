package practice;

import java.util.Scanner;

public class Prime {
	public boolean prime(int num) {
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Prime p = new Prime();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number");
		int num = sc.nextInt();
		 boolean r= p.prime(num);
		 System.out.println(r);

	}
}
