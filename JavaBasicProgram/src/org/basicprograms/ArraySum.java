package org.basicprograms;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]= {3,6,87,97,88};
		int sum=0;
		
//		for(int i=0;i<a.length;i++) {
//			sum=sum+a[i];
//		}
		for(int i:a) {
			//System.out.println(i);
			sum=sum+i;
		}
		System.out.println("Total Sum of Array Value:" +sum);

	}

}
