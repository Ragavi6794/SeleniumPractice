package org.overload;

public class Subtraction extends Addition {
	 
	    	 void add(int a,int b) {
	    		System.out.println(a-b);
	    	}
	    	 void add(int a,int b,int c) {
	    		System.out.println(a*b+c);
	    	}
	    	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Subtraction subs= new Subtraction();
		 subs.add(7, 5);//override
		 subs.add(5, 2, 2);
		 

	}

}
