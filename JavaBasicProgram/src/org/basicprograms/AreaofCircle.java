package org.basicprograms;

import java.util.Scanner;

public class AreaofCircle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius");
		double radius = sc.nextDouble();
		
		//Find the radius of Circle formula =PirSquare
		double AreaofCircle=Math.PI*radius*radius;
		System.out.println("Area Of Circle Is \t" +AreaofCircle );
		
	}

}
