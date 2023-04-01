package org.basicprograms;

import java.util.Scanner;

public class LeapYearProgram {

	public static void main(String[] args) {
		//if  centuary year its should divided into 100 and 400 or it divided into 4 its is leapYear
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Year");
		int year = sc.nextInt();

		//check the its centuary year 
		/* if(((year%100==0)&&(year%400==0)) ||(year%4==0)) {
        	    System.out.println("It is LeapYear");
        }
        else {
				System.out.println("It is not Leap Year");
			}
        */
		if(year%100==0) {                                       //centuary year
			System.out.println("It is centuary Year");

			if(year%400==0) {                                   //Leap Year+centuary year
				System.out.println("It is Centuary and Leap Year");
			}
			else {
				System.out.println("It is not Leap Year but Centuary Year");
			}
		}

		else {
			if(year%4==0) {                                      //not centuary year but leap year
				System.out.println("It is Not Centuary but Leap Year");
			}
			else {
				System.out.println("It is not Leap Year");
			}
		}
	}



}
