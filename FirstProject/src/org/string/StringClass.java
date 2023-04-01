package org.string;


public class StringClass {
//String Methods
	public static void main(String[] args) {
		
	String a="Computer Programming";
	String b="Java Programming";
	
	int length=a.length();
	System.out.println(length);
   
	char charAt= a.charAt(2);
	System.out.println(charAt);
	
	int lastIndexOf = a.lastIndexOf('m');
	System.out.println(lastIndexOf);
	
	int indexof=a.indexOf('m');
    System.out.println(indexof);
    
    String tolower=a.toLowerCase();
    System.out.println(tolower);
    
    String toupper=a.toUpperCase();
    System.out.println(toupper);
    
    boolean empty=a.isEmpty();
    System.out.println(empty);
    
    String sub=a.substring(3);
    System.out.println(sub);
    
    String sub1=b.substring(2, 8);//va Pro
    System.out.println(sub1);
    
    
    boolean start=a.startsWith("Comp");
    System.out.println(start);
    
    boolean end=a.endsWith("mming");
    System.out.println(end);
    
    boolean contains=a.contains("Computer Programming");
    System.out.println(contains);
    
    boolean equal=a.equals(b);
    System.out.println(equal);
   
    boolean equalsignore=a.equalsIgnoreCase(b);
    System.out.println(equalsignore);
    
    int compare=a.compareTo(b);
    System.out.println(compare);
    
    String replace=b.replace('a', 'o');
    System.out.println(replace);
    
    String replacaall=b.replaceAll("Java", "Python");
    System.out.println(replacaall);
    
    String trim=a.trim();//remove space 
    System.out.println(trim);
    
    String concate=a.concat(" Language");
    System.out.println(concate);
     
    String[] split = a.split(" ",5);
   System.out.println(split);
   
   String str = new String("geekss@for@geekss");
   String[] arrOfStr = str.split("Fi",2);
   System.out.println(arrOfStr);
    
    
}
}