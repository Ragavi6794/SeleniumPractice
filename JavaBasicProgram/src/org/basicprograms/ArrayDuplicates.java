package org.basicprograms;

import java.util.Arrays;
import java.util.HashSet;

public class ArrayDuplicates {

	public static void main(String[] args) {
		String str[]= {"java","c","python","java","c#","python"};
		String s= "";
		for(int i=0;i<str.length;i++) {
         for(int j=i+1;j<str.length;j++) //0+1=1{
        	 if(str[i]==str[j]) {
        		 
        		 System.out.println("Duplicates:" +str[i]);
         }
		}
		
		//hashset =>collections
		HashSet lan=new HashSet();
		for(String l:str) {   //get all array value into the l variable
			//System.out.println(l);
			boolean add = lan.add(l);
			
			if(add==false) {
			
				System.out.println("Duplicates in HashSet:\t" +l);
			
			}
			
			//System.out.println(add); //which one is duplicate that only print false
		}
		//System.out.println(lan);
		
		//sorted 
		Arrays.sort(str);
		String sorted = Arrays.toString(str);
		System.out.println(sorted);
		
	}

}
