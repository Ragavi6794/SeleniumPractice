package org.constructor;

public class SuperClass {
	String locate="Coimbatore";
	String mobile;
	int price;
SuperClass(){
	
	System.out.println("Default constructor");
}

SuperClass(String vivo,int rate){
	mobile=vivo;
	price=rate;
}

public void mobilePhone() {
	System.out.println("Mobile Details:" +mobile +price);
}
	
	public static void main(String[] args) {
		

	}

}
