package org.basicprograms;

import java.util.Scanner;

public class CountString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.nextLine();  //it accept the space //Hi how are you  
		int count=1;   //word start 1
		for(int i=0;i<=s.length()-1;i++) {

			if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' '))
			{
				//char index = s.charAt(i);  =>like length
				count++;
			}
			
		}
		System.out.println("Count of Words in Sentence" +count);
		
		
		//remove spaces
		
		String space="Java   program is easy";
		space = space.replaceAll("\\s","");  //\\s == space
		System.out.println(space);
	}
}