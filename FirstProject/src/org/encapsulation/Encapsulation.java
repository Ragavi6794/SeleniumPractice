package org.encapsulation;

public class Encapsulation {
	private String name="Ragavi";
	private int age=28;
	private String email="ragavi@gmail.com";
	private String password;
	
	//getter method used read the values
	public String getName()  //can access read only
	{
		return name;
	}
	//setter method is used to write the values
	public void setName(String Name) {  //can access write only
		this.name=Name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//can get only get value for read only access
	public String getEmail() {
		return email;
	}
 //can set only write access
	public void setPassword(String pass){
		this.password=pass;	
	}
}
/*Encapsulation class attributes can make only read or write only access

Increases security of data*/