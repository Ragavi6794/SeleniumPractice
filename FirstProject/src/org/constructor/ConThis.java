package org.constructor;

public class ConThis {
	int a; //Instance or global variable
	int b;
	
ConThis(){ 
	// Default constructor because classname and method name as same
	this(3, 6); //use this() method
	System.out.println("Welcome Our Site ");
	this.display();

}

ConThis(int a,int b){ //parameterzed constructor
//we can assign cons var to instanc var
	this.a=a; 
//this=> when parameter var name as same as instance var then use 'this keyword'
	this.b=b;
//	System.out.println(a+b);
}

ConThis(String name,char i){
	System.out.println("Welcome Parameterized Constructor:\n"+name +i);
}

void display() {
	System.out.println("Addition:"+(a+b));
}


	public static void main(String[] args) {
		ConThis con=new ConThis();
//when we create an object then automatically invoke the constructor
		ConThis con1=new ConThis("Ragavi",'M');
//		con1.display();
		

	}

}
