package org.basicprograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int f = sc.nextInt();
		int fact=1;
		
		for(int i=f;i>=1;i--) {  //5*4*3*2*1
			fact=fact*i;
		}
		
//		for(int i=1;i<=f;i++) {  //1*2*3*4*5
//			fact=fact*i;
//		}
		System.out.println("The Factorial Is:" +fact);
	}

}
