package org.overload;

public class Addition {

     void add(int a,int b) {
		System.out.println(a+b);
	}
	 void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
    
   	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Addition addme=new Addition();
			addme.add(5,7);
			addme.add(7,3,3);
			
		
		}
	

}
