package org.scanner;

import java.util.Scanner;

public class SecondClass {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Name:");
			String name=sc.next();
		System.out.println("Enter Your Id:");
		   int id =sc.nextInt();
		System.out.println(name);
		System.out.println(id);
		
		

	}

}
