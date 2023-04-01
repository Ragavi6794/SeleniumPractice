package org.basicprograms;

public class SwapToNumbers {

	public static void main(String[] args) {
		int a=5,b=10,c;
		//swapping
		System.out.println("Before Swapping Numbers: "+a+"\t"+b);
		//Logic-1 with Third variable
		c=a;
		a=b;
		b=c;
		System.out.println("After Swapping numbers:"+a+"\t"+b);
		
		
		//Logic-2 without third variable
		b=a+b; //5+10=15
		a=b-a;  //15-5=10
		b=b-a;  //15-10=5
		System.out.println("Again Swapping numbers:"+a+"\t"+b);
		
	}

}
