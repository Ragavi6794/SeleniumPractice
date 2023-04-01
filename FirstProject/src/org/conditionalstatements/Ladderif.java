package org.conditionalstatements;

import java.util.Scanner;

public class Ladderif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // int x=20,y=50,z=30; //variable declaration
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Radha Mark");
         int radha=sc.nextInt();
         System.out.println("Enter Sidhu Mark");
         int sidhu=sc.nextInt();
         System.out.println("Enter Viknesh Mark");
         int viknesh=sc.nextInt();
         
         System.out.println();
         if(radha>sidhu && radha>viknesh) {
        	 System.out.println("Radha is Highest Mark in the Classroom"   +radha);
             }
        	 else if(sidhu>viknesh && sidhu>radha) {
        	 
            	 System.out.println("Sidhu is Highest Mark in the Classroom" +sidhu);
        	 }
         
        	 else {
        		 System.out.println("Viknesh is Highest Mark in the Classroom" +viknesh);
        	 }
         
	}

}
