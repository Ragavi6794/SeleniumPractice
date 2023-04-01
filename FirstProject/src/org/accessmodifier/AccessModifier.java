package org.accessmodifier;

public class AccessModifier {

	static int a=10;
	static int b=20;
	 int c=9;
	 int d=2;
	String name="Addition";
	String name1="Division";
	
	final void add() { 
		
		System.out.println(a+b);
	}
	static int sub() { 
		//void not return anything 
				//datatype only return
		//cann't create object for it
		return a-b;
	}
	
	private void mul() {
		System.out.println(a*c);
	}
	public void div() {
		System.out.println(b/a);
	}
	
	public static void main(String[] args) {
//cann't create object for it directly get value
	System.out.println("Static Method:" +sub());
	System.out.println("My name is Ragavi");
    AccessModifier am=new AccessModifier();
    am.add();
    am.mul();
    am.div();
	}

}
