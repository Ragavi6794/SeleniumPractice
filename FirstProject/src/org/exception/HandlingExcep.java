package org.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandlingExcep  {

	public static void main(String[] args) {
		//Multicatch Exception
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
    int a=sc.nextInt();
    int b=sc.nextInt();
    try {
    	System.out.println(a/b);
    }
//    catch(ArithmeticException ae) {
//    	System.out.println("Cannot be divided zero");
//    }
//    catch(InputMismatchException ie) {
//    	System.out.println("Input mismatched");
//    }
//    catch (Exception e) {
//        System.out.println("Something went wrong.");
//      } 
    finally {
    	System.out.println("done");
    }
	}

}
