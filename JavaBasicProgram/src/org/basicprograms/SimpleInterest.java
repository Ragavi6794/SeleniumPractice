package org.basicprograms;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principal Amount");
		int p = sc.nextInt();
		System.out.println("Enter Rate");
		double r=sc.nextDouble();
		System.out.println("Enter TimePeriod");
		int t = sc.nextInt();
		
		//find simple interest
		int simpleInt=(int) ((p*r*t)/100);
		System.out.println("Simple Intrest is:" +simpleInt);
	}

}
