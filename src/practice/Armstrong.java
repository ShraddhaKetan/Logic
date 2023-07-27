package practice;

import java.util.Scanner;

public class Armstrong {

	public void armstrong(int num) {
		int count = 0;
		int last = 0;
		int temp = num;

		while (temp > 0) {
			temp = temp / 10;
			count++;
		}

		temp = num;
		System.out.println(count);

		while (num > 0) {
			int result = 1;
			int f = num % 10;
			for (int i = 1; i <= count; i++) {
				result = result * f;
			}

			last += result;
			num = num / 10;
		}
		System.out.println(last);
		
		if(temp==last) {
			System.out.println("Its a armstrong number");
		}else {
			System.out.println("Its not a armstrong number");
		}
		

	}

	public static void main(String[] args) {
		Armstrong r = new Armstrong();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number");
		int num = sc.nextInt();
		r.armstrong(num);

	}
}
