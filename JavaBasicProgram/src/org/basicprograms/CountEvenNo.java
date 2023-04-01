package org.basicprograms;

public class CountEvenNo {

	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				//system.out.Println(i);
				count++; //count=count+1;
			}
		}
		System.out.println("Count of Even No \t" +count);

	}

}
