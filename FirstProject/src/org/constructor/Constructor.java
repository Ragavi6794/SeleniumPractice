package org.constructor;

public class Constructor {
	int x; //instance variable
	
	public Constructor(){//default Constructor
		this(11023); //call parameter constructor
		x=5; //value assign for instance var
		System.out.println("Student RegNo");
		
	}
	public Constructor(int z){
		this("Viknesh");
		System.out.println("Student Name");
	}
	

	public Constructor(String string) {
		this(89.6);
		System.out.println("Percentage");
	}
	
	
	public Constructor(double per) {
        this(false);
        System.out.println("Is Eligible");
	}
	public Constructor(boolean b) {
		System.out.println(" Student Details");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Constructor cs=new Constructor();
          System.out.println(cs.x);
	}

}
