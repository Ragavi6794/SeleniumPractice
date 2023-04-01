package org.first;

public class BasicClass {
//Access FirstClass methods into Basic class without using inheritance
	private void Empid() {
		System.out.println("emp001");
	}
	private void Empname() {
		System.out.println("Ragavi");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicClass bc=new BasicClass();
		FirstClass fc=new FirstClass();
		bc.Empid();
		bc.Empname();
		fc.MobileBrand();
		fc.MobileColor();
       
	}

}
