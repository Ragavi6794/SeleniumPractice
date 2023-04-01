package org.basicprograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		//reverse Number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int number = sc.nextInt();
		int orginal_number=number;   //get the input value is stored here permanently
		int rev=0;
		//check condition number =0
		while(number!=0) {
			rev=rev*10+number%10;  //get modulo then change into position
			number=number/10;  //remove last no then get quatient
		}
		
		System.out.println("Reverse Number:" +rev);
		
		//check its polindrome no or no
		if(rev==orginal_number) {
			System.out.println("It is Palindrome" );
		}
		else {
			System.out.println("It is not Palindrome" );
		}
		
		//StringBuffer
		StringBuffer sb=new StringBuffer(String.valueOf(orginal_number));
		StringBuffer reverse = sb.reverse();
		System.out.println(reverse);
		//check its polindrome no or no
				if(reverse.equals(orginal_number)) {
					System.out.println("It is Palindrome" );
				}
				else {
					System.out.println("It is not Palindrome" );
				}
				
	}

}
