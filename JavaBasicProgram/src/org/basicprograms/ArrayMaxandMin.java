package org.basicprograms;

import java.util.Arrays;

public class ArrayMaxandMin {

	public static void main(String[] args) {
		int a[]= {10,13,4,5,2,9};
		int max=0;
		int min =a[0];
		for(int i=0;i<a.length;i++) {
			
			if(max<a[i]) {
				max=a[i];
			}
			  if(min>a[i]) {
					min=a[i];
				}
			  
			
		}
   System.out.println("Maximum Number" +max);
  
   System.out.println("Manimum Number" +min);
   
   //sorted array
	 
// Arrays.toString(a);
   Arrays.sort(a);
  
System.out.println( Arrays.toString(a));
	}

}
