package org.accessmodifier;

public class AccessModifier2 extends AccessModifier {
	
	public void addition() {
		
		System.out.println(super.name);
	}
	public void div() {
		
		System.out.println(super.c/super.d); 
		//access parent class variable
	}
	public void wel() {
		super.div(); //parent method
		System.out.println("Ragavi");
	}
//	pubic void add() { 
	//cannot be overide because its final method
//		
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		AccessModifier2 a=new AccessModifier2();
		
		a.addition();
		a.add(); //access parent class method inheritance
	    a.div();
	    a.wel();
		}
	}


