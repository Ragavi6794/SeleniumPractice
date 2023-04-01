package org.collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class CollectionArrayList {
	public static void main(String[] args) {
		// collection--list
		List li=new ArrayList();
		//add method
		li.add("Ragavi");
		li.add(1150726);
		li.add('O');
		li.add(9842338249l);
		System.out.println(li);
		
		List li1=new ArrayList();
		li1.add("Eswaran");
		li1.add("Lithiksha");
		li1.add('O');
		
		//size
		int size = li.size();
		System.out.println(size);
		
		//get(index)
		Object object = li.get(2);
        System.out.println(object);
        
       //add(index,value)
        li.add(3,"Software Engineer");
        //to add value at given index position
        System.out.println(li);
        
        //set(index,value)
        Object set = li.set(0, "Lithiksha");
        //to replace particular value at given index position
        System.out.println(li);
        
        //remove(index)
        //remove particular value at index
        Object remove = li.remove(2);
        System.out.println(li);
        //contains(value)
        //it checks that value contains is or not
        boolean contains = li.contains("Thamarai");
        System.out.println(contains);
        
      
        
        //isEmpty
        boolean empty = li.isEmpty();
        System.out.println(empty);
     
        
        
        
//        int indexOf = li.indexOf("Ragavi");
//        System.out.println(indexOf);
        
        //clear
//        li.clear();
//        System.out.println(li);
//  
//             li1.addAll(li);
//        System.out.println(li1);
        
        li1.retainAll(li);
        System.out.println(li1);
//        
//        li1.removeAll(li);
//        System.out.println(li1);
        
        ArrayList a=new ArrayList();
        a.add("Viknesh");
        a.add('O');
        a.add(113004);
        a.add("PPG College");
        a.add(true);
        System.out.println(a);
        boolean add = a.add(90);
        System.out.println(a);
        
        int indexOf = li.indexOf("Viknesh");
        System.out.println(indexOf);
      
       a.subList(2,4);
       System.out.println(a);
       
       
       Iterator iterator = li.iterator();
       System.out.println(iterator);
        
	}
}


