package org.exception;
public class ThrowParent {
private void vote(int age)  {
	//Throw is keyword.it throws single exception at a time.User defined exception =throw	
	if(age<18) {
		//user create our custom exception in method body or block
		throw new ArithmeticException("Give proper input");
	}
	else {
		System.out.println("You are eligible for vote");
	}
}
//throws =>can be multple exception throw,declared in method signature 
public void name(String s) throws NullPointerException,StringIndexOutOfBoundsException{
if(s==null) {
	try
	{    
	throw new NullPointerException();
	}
	catch(NullPointerException n) {
		System.out.println("Null Pointer Exception.Please give proper input");
	}
}
else {
	try {
		s.charAt(20); //index out of bounds
		throw new StringIndexOutOfBoundsException("Index not value");
	}
	catch(StringIndexOutOfBoundsException se) {
		System.out.println("Index out OF Bounds Exception");
	}
	
}
}

public void address(String add)  throws NullPointerException{
	//this method can be access from childclass
}

public static void main(String[] args) {
		ThrowParent tp=new ThrowParent();
		try {
			tp.vote(17);
		}
		catch(ArithmeticException e){
			System.out.println("Please give age above 18");
		}
		tp.name("Ragavi");
	}

}
