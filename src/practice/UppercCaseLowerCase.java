package practice;

import java.util.Scanner;

public class UppercCaseLowerCase {
	public static void main(String[] args) {
		String str = "Java Development";

		StringBuffer newstr = new StringBuffer(str);
		for (int i = 0; i <= str.length() - 1; i++) {

			if (Character.isLowerCase(str.charAt(i))) {
				newstr.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			} else if (Character.isUpperCase(str.charAt(i))) {
				newstr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
		}
		System.out.println(newstr);
//===========================================================================================================//
		String str1 = "uPPer CaSE & LoWER Case";
		char[] ch = str1.toCharArray();

		for (int i = 0; i <= ch.length - 1; i++) {

			if (ch[i] == ' ') {
				System.out.print(" ");
			} else if (ch[i] >= 65 && ch[i] <= 90) {
				int number = ch[i] + 32;
				char character = (char) number;
				System.out.print(character);
			} else if (ch[i] >= 97 && ch[i] <= 122) {
				int number = ch[i] - 32;
				char character = (char) number;
				System.out.print(character);
			} else {
				System.out.print(ch[i]);
			}

		}
	}
}

//
