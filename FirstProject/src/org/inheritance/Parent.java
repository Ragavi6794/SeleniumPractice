package org.inheritance;

public class Parent extends GrandParent {
	int a=900;
     public void Vechicle() {
    	 System.out.println("CAR");
     }
     public void Jewel() {
    	 System.out.println("5kg");
     }
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Parent p=new Parent();
       p.Jewel();
       p.Vechicle();
       p.Land();
       p.House();
	}

}
