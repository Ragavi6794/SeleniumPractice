package org.basicprograms;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int number = sc.nextInt();
        
        //check odd or even
        if(number%2==0) {
        	System.out.println("It is Even Number \t" +number);
        }
        else {
        	System.out.println("It is Odd number \t" +number);
        }
	}

}
