package org.basicprograms;

import java.util.Scanner;

public class PalindromeString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your String");
	String str = sc.next();
	String rev="";
	for(int i=str.length()-1;i>=0;i--) {
		char index = str.charAt(i);
		rev=rev+index;
		
	}
	System.out.println("Reverse String " +rev);
	//check it palindrome or not
	if(rev.equalsIgnoreCase(str))
	{
		System.out.println("It is palindrome");
	}
	else {
		System.out.println("It is not Palindrome");
	}
	
	
	
}
}
