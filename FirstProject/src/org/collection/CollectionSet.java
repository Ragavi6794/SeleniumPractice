package org.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSet {

	public static void main(String[] args) {
		//Collection-set
		System.out.println("HashSET in Collection in Random Order");
		Set s=new HashSet();
		s.add("Ragavi");
		s.add(123344);
		s.add("BCA"); //its not get duplicate value
		s.add('A');
		s.add("BCA");
		s.add(null);
		//It display RandomOrder
		System.out.println(s);
		
		System.out.println("\n LinkedHashSET in Collection in Insertion Order");
		Set s1=new LinkedHashSet();
		s1.add("Ragavi");
		s1.add(123344);
		s1.add("BCA"); //its not get duplicate value
		s1.add('A');
		s1.add("BCA");
		s1.add(null);
		//it display Insertion Order
		System.out.println(s1);
		
		LinkedHashSet s2=new LinkedHashSet();
		s2.add(45);
		s2.add("Subba");
		System.out.println(s2);

		System.out.println("\n TreeSET in Collection in Ascending Order");
		Set<String> a=new TreeSet<String>();
		//its not get duplicate value
		a.add("Ragavi");
		a.add("Padma");
		a.add("Abinaya");
		a.add("Parkavi");
//		a.add(null); // it not accept null value in tree
		a.add("Kumaresan");
		a.add("Prasanth");
		a.add("Ragavi");
		//a.add(null);
         //It display Ascending Order
		System.out.println(a);
//it support only enchaced for loop
		for(String i:a) {
			System.out.println(i);
		}
	//list	
		LinkedList ls=new LinkedList();
		ls.add(15);
		ls.add(40);
		ls.add(20);
		ls.add(20);
		ls.add(10);
//		ls.add('c');
//		ls.add(null);
		System.out.println("\n List allow duplicates object:" +ls);
		
	//covert set from List because we need non-duplicate datas
		LinkedHashSet hs=new LinkedHashSet(ls);
		System.out.println("\n Set remove duplicates:" +hs);
		
		//ascending order
		TreeSet ts=new TreeSet(ls);
		System.out.println("\n TreeSet remove duplicates and sort:"+ts);
	//to convert toArray from list
		Object[] array = hs.toArray();
		System.out.println("\n ToConvert Array:");
	for(Object o:array) {
		System.out.println( o);
		
	}
		
		

	}

}
