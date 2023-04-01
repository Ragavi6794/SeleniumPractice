package org.conditionalstatements;
import java.util.Scanner;
public final class ConditionGetInput {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age");
		int age=sc.nextInt();
		//IF ELSE	
				if(age>=18) {
					System.out.println("You Are eligible for vote");
				}
				else {
					System.out.println("You Are Not eligible for vote");
				}			
		System.out.println("Enter Your Java Mark");
		int java=sc.nextInt();
		
		System.out.println("Enter Your .Net Mark");
		int net=sc.nextInt();
		
		System.out.println("Enter Your C prog Mark");
		int clan=sc.nextInt();
		
		System.out.println("Enter Your Html Mark");
		int html=sc.nextInt();
		
		System.out.println("Enter Your Python Mark");
		int python=sc.nextInt();
		//AND OPERATOR
		if(java>=55&&net>=55&&clan>=55&&html>=55&&python>=55) {
			System.out.println("Student hasbeen Passed");
		}
		else {
			System.out.println("Student hasbeen Failed");
		}

	}

}
