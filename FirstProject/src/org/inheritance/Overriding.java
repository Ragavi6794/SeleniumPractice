package org.inheritance;

public class Overriding extends Parent {
	
	public void Vechicle() { 
		//parent
		super.Vechicle();
		System.out.println("BYKE");
		System.out.println(super.a);
	
	}
	public void Jewel() {
		System.out.println("20kg");
	}
    public void Land() {             //grandparent
    	System.out.println("Chennai");
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
   Overriding or=new Overriding();
   or.Vechicle();
   or.Jewel();
   or.Land();
	}

}
