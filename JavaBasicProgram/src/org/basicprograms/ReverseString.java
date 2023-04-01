package org.basicprograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your String");
		String str = sc.next();
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			char index = str.charAt(i);  //get character based index value
			rev=rev+index;
		}
		System.out.println("Reverse the String" +rev);
		
	//String Buffer class
		StringBuffer sb=new StringBuffer(str);
		StringBuffer buff = sb.reverse();
		System.out.println("Reverse in Buffer" +buff);
		
	//String builder
		StringBuilder sbi=new StringBuilder();
		sbi.append(str);  //it put into value to the builder
		StringBuilder builder = sbi.reverse();
		System.out.println("Reverse Builder:" +builder);
	}

}
