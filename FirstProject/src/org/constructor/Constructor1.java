package org.constructor;

public class Constructor1 {
 int a;
 int b;
 String s;
 Constructor1(){ //constuctor name should be same as class name
	 //Default constructor
	 a=10;
	 b=10;
	 System.out.println("Default");
 }
 Constructor1(int x,int y){
	 //parameterized constructor
	a=x;
	b=y;
 }
 Constructor1(String name){
	 s=name;
 }
 private void add() {
	 System.out.println(a+b);
	 
 }
 private void str() {
	 System.out.println(s);
 }
 

	public static void main(String[] args) {
		Constructor1 c=new Constructor1(8,9);  //without method calling
		Constructor1 d=new Constructor1("Ragavi");
		c.add();
		d.str();

	}

}
