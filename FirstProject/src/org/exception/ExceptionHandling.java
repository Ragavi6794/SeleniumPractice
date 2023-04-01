package org.exception;
import java.util.Scanner;
public class ExceptionHandling {

	public static void main(String[] args) {
		//Exception Handling
		ExceptionHandling ex=new ExceptionHandling();
		ex.divided();
		ex.addition();	
	
	}
	private void addition() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number a");
		int a=sc.nextInt();
		System.out.println("Enter number b");
		int b=sc.nextInt();
		System.out.println(a+b);
		
	}

	private void divided() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number a");
		int a=sc.nextInt();
		System.out.println("Enter number b");
		int b=sc.nextInt();
		try {
		System.out.println(a/b);
		}
		catch(ArithmeticException e){
			System.out.println("Cannot be divided in zero.Please give again input");
			divided();//call divided method again
		}
		finally {
			System.out.println("Handled exception");
		}
		
	}

}
