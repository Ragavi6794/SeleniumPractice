package org.conditionalstatements;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
         System.out.println("Enter Radha Mark");
         int radha=sc.nextInt();
         System.out.println("Enter Sidhu Mark");
         int sidhu=sc.nextInt();
         System.out.println("Enter Viknesh Mark");
         int viknesh=sc.nextInt();
         
         if(radha>sidhu) {
        	 
        	 if(radha>viknesh) {
        		 System.out.println("Radha is Greatest Mark" );
        	 }
        	 else {
        		 System.out.println("Viknesh is Greatest Mark ");
        	 }
        	 
            }
        else {
         
             if(sidhu>viknesh){
        	     System.out.println("Sidhu is Greatest Mark");
               }
             else {
        	    System.out.println("Viknesh is Greatest");
               }
	
         }

               }
}