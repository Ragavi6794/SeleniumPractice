package org.returnn;
public class Return {
	static int x=10;//global variable
	static int y=2;
	
	int a=7,b=5;
	static int sum() { //no object creation its static method 
		return x+y;    //static create a memory for sum method
		               // without object creation
	}
	
	int total() {
		return (a-b)*x; 
//non-static method return value through create a object for this method
		
	}
	
	void subtract() { 
//void method no return value its return  directly through object creation 
		int z=(x-y)*(a+b)-y+x;
		System.out.println("Void Method \n" +z);	
	}
	
	public static void main(String[] args) {
	
	// TODO Auto-generated method stub
   //  int c=sum();
     System.out.println("Static Return Method:\n"+sum());
     
     Return rt=new Return();
     int c= rt.total(); //get return value to store c variable
     
    System.out.println("Return Method:\n"+c);
    
    rt.subtract(); //void create object for memory space for sub method
   
	}

}