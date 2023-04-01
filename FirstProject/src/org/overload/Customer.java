package org.overload;

public class Customer {
private void fillForm(String name,int acno,int phoneno) {
	System.out.println("Customer1:" +name+acno+phoneno);
}
private void fillForm(String name1,int acno1,int phoneno1,String email) {
	System.out.println("Name:Ragavi ,Acno:756946,Phoneno:7403288028,email:ririfh@gmail.com");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Customer cus=new Customer();
 cus.fillForm("Ragavi", 84274, 832094); 
 cus.fillForm("Eswaran",43784,2894,"dfhshsfg");
	} 

}
