package org.exception;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		// Runtime exception
		
//Input Missmatch Exception
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Your Id no");
   int x=sc.nextInt();
	

//ArrayIndexOut of Bounds of Exception
	String s[]= {"Raga","Viki","Eswar"};
	//System.out.println(s[4]);

		
//StringIndexOut of Bounds of Exception
	String st="Hi Welcome.";
	System.out.println(st.charAt(1));
	
//NUmber format Exception
	//int b=Integer.parseInt("rnj");
	
//IndexOutofBound Exception
	
	List<String> li=new ArrayList<String>();

	li.add("Ragavi");
	li.add("Padma");
	li.add("Abinaya");
	li.add("Parkavi");
	li.add("Kumaresan");
	System.out.println(li);
	
	String string = li.get(9);
	System.out.println(string);

//Null pointer exception
	String n=null;
	System.out.println(n.charAt(0));
//		Object a= null;
//	    a.toString();
	
	//Exception ex=new Exception();
	System.out.println(0);
	System.out.println(1);
	System.out.println(2);
	try {
	System.out.println(3/0);}
	catch(ArithmeticException ae){
		System.out.println(3/3);
		System.out.println(ae);
		//System.out.println("Can't divided by zero");
	}
	finally {
		System.out.println("done");
	}
	System.out.println(4);
	System.out.println(5);
	
	
	
	}
	
	
	
	
}