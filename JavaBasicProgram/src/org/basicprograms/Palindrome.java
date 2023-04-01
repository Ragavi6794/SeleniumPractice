package org.basicprograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		//Printing string in Reverse Order
	//String s="Ragavi";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Word");
		String s = sc.nextLine();
		String palindrome="";
		
		for(int i=s.length()-1;i>=0;i--) {
			//System.out.println(s.charAt(i)); //it reverse the string
			palindrome= palindrome+s.charAt(i);
			
		}
		if(palindrome.equals(s)) {
			System.out.println("Given Input is Palindrome" +palindrome);
		}
		else {
			System.out.println("Given Input is not Palindrome" +palindrome);
		}

	}

}
