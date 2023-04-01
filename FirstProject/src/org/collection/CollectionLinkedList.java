package org.collection;
import java.util.LinkedList;
public class CollectionLinkedList {
public static void main(String[] args) {
//it store values in linked list means it store values 
//in one list contains after list memory connect to next list 
		LinkedList ll=new LinkedList();
        ll.add("Honda");
        ll.add("Maruthi");
        ll.add("KIA");
        System.out.println(ll);
        //add first method
        ll.addFirst("BMW");// addFirst element inlist
        ll.addLast("Mahindra"); //addLast element inList
        System.out.println(ll);
        //getfirst
        Object first = ll.getFirst(); 
        System.out.println(first);//getFrist element
        
        Object last = ll.getLast();
        System.out.println(last);//getLast Element
        
       //poll
        ll.poll();
        System.out.println("POLL:" +ll);
        ll.pollFirst();
        System.out.println("POLL:" +ll);
        
        //offer
        ll.offer(700000);
        System.out.println("OFFER:" +ll);
        
        //push
        ll.push("Suzuki"); //add first
        System.out.println("Pushing First:" +ll);
        
        //pop
        ll.pop(); //remove first
        System.out.println("Pop First:" +ll);
	}

}
