package org.encapsulation;

public class MainEncapsulation extends Encapsulation {

	public static void main(String[] args) {
		MainEncapsulation en=new MainEncapsulation();
		en.setAge(30); //can update value use set
		en.setName("Dharani");
		
		System.out.println("Age:\t" +en.getAge());
		System.out.println("Name:\t" +en.getName());
		
	
		en.setPassword("***123");//only write access

		//only read access
		System.out.println("Email: \t" +en.getEmail());
		
		

	}

}
