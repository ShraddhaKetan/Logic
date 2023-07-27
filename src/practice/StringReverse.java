package practice;

import java.util.Scanner;

public class StringReverse {
	public static void reverse(String str) {
//		String rstr="";
//		for(int i=str.length()-1;i>=0;i--) {
//			rstr=rstr+str.charAt(i);
//			}
//		System.out.println("Reverse string is "+rstr);
		
		
	String revString="";
	char[] ch=str.toCharArray();
	for(int i=0;i<=ch.length-1;i++) {
		revString=ch[i]+revString;
	}
	System.out.println("Reverse string is "+revString);
	
	}
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the string");
		String str=scanner.next();
		reverse(str);
		
	}

}
