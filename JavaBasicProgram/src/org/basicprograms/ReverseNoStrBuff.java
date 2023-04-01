package org.basicprograms;

import java.util.Scanner;

public class ReverseNoStrBuff {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		//string Buffer
/*		StringBuffer sb=new StringBuffer(String.valueOf(num));  //convert no into string
        StringBuffer reverse = sb.reverse();  //reverse string
       System.out.println("Reverse Number: " +reverse); */
       
       
       //StringBuilder
		StringBuilder sbi=new StringBuilder();
		sbi.append(num);  //it appended to builder
		StringBuilder reverse = sbi.reverse();
		System.out.println("Reverse Number:" +reverse);
       
	}

}
