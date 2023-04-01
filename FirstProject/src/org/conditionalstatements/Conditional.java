package org.conditionalstatements;

public class Conditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean aadhar=false;
		boolean votid=false;
		//if else use and operator
		if(aadhar==true || votid==true) {
			System.out.println("You Are Eligible for BankAccount Opening");
		}
		else {
			System.out.println("You Are Not Eligible for BankAccount Oprning");
		}

	}

}
