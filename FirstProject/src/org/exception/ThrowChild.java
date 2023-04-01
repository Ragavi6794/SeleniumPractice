package org.exception;

public class ThrowChild extends ThrowParent {
//override from parentclass exception
	public void address(String add) {
		try {
			throw new NullPointerException();
		}
		catch(NullPointerException ne) {
			System.out.println("Parent Address is null");
		}
	}
	
	public static void main(String[] args) {
	ThrowChild tc=new ThrowChild();
	tc.address(null);
	

	}

}
