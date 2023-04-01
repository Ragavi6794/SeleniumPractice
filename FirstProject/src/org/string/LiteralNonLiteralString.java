package org.string;
public class LiteralNonLiteralString {
	public static void main(String[] args) {
// Literal String
		//allocate same memory location for duplicate value
		String s="Selenium Testing";
		String t="Selenium Testing";
		System.out.println("\n Literal String");
		//identify memory location for string
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(t));
		System.out.println(s.hashCode());
		System.out.println(t.hashCode());
		
//Non Literal String
		String u=new String("Selenium");
		String u1=new String("Selenium");
		System.out.println("\n Non Literal String");
		//identify different memory location
		System.out.println(System.identityHashCode(u));
		System.out.println(System.identityHashCode(u1));
		
//Immutable String
		String a="Core";
		String b="Java Programming";
		String concat = a.concat(b);
		System.out.println("\n Immutable String");
		System.out.println(concat);
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		System.out.println(System.identityHashCode(concat));
		
//Mutable String
		StringBuffer c=new StringBuffer("Python");
		StringBuffer d=new StringBuffer("Programming");
		StringBuffer append = c.append(d);
		System.out.println("\n Mutable String");
		System.out.println(append);
		//store same memory of c and d in append
		System.out.println(System.identityHashCode(c));
		System.out.println(System.identityHashCode(d));
		System.out.println(System.identityHashCode(append));
		
	}

}
