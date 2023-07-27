package practice;

import java.util.Scanner;

public class EvenOddCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name = "aaapZZqjahhhccXx";
		char[] ch = name.toCharArray();
		int count = 0;

		System.out.println("enter the word");
		int alphabet = sc.next().charAt(0);

		for (int i = 0; i <=name.length()- 1; i++) {

			if (alphabet == name.charAt(i)) {
				count++;
			}

		}
		
		System.out.println(count+" count of char");

	}
}
