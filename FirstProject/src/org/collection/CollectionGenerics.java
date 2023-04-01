package org.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionGenerics {

	public static void main(String[] args) {
//we can achive to store similar datatype value in ast by using generics<>
		System.out.println("1st Batch");
		List<String> a=new ArrayList<String>();
		//add
		a.add("Ragavi");
		a.add("Padma");
		a.add("Abinaya");
		a.add("Parkavi");
		a.add("Kumaresan");
		a.add("Prasanth");
		a.add("Ragavi");
		System.out.println( a);
		
		System.out.println( "2nd Batch");
		List b=new ArrayList();
		b.add("Parkavi");
		b.add("Kumaresan");
		b.add("Venkat");
		b.add("Viknesh");
		System.out.println(b);
		//indexOf(vlaue)
		int indexOf = a.indexOf("Abinaya");
		System.out.println(indexOf);
		
		//sort
        Collections.sort(a);;
        System.out.println("\n Sorted" +a);
		
		//add all
//		b.addAll(a);
//		System.out.println(b);
 
		//retainall
//		b.retainAll(a);
//		System.out.println(b);
		
		//removeall
		//remove data from both list common values
//		b.removeAll(a);
//		System.out.println(b);
//		
		Iterator<String> i = b.iterator();
		while(i.hasNext()) {
			if(i.next().equals("Parkavi"))
				i.remove();
			//System.out.println(i.next());
		}
		System.out.println(b);
		
		
		System.out.println(i);
		for(String s:a) {
			System.out.println(s);
		}
		
		for(Object s1:b) {
			System.out.println(s1);
		}
	}
	

}
