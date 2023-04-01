package org.basicprograms;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numer");
		int prime = sc.nextInt();
		int count=0;
		for(int i=2;i<prime;i++) {  //it divided 2,3,4,5,6,7,8,9.......
			//it divided 1 and itself is Prime Number
			if(prime%i==0) {
				count++;
			}
		}
		if(count>0) {
			System.out.println("It is not Prime No");
		}
		else {
			System.out.println("It is Prime No");
		}
	}

}
