package org.mapinterface;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashMap<Integer,String> mp=new HashMap<Integer,String>();
    mp.put(111, "Viknesh");
    mp.put(113, "Thamarai");
    mp.put(211, "Dhraman");
    mp.put(110, "Muthu");
    mp.put(115, "Thamarai");
    mp.put(111, "Radha");
    System.out.println("Hahmap print Random Order \n"+mp);
    
    LinkedHashMap<Integer,Integer> lmp=new LinkedHashMap<Integer,Integer>();
    lmp.put(1101, 470);
    lmp.put(1103,380);
    lmp.put(2101, 259);
    lmp.put(1010, 306);
    System.out.println("\n LinkedHashMap print in Insertion Order \n" +lmp);
	
    TreeMap tmp=new TreeMap();
    tmp.putAll(mp); 
    //we can change one map interface to another
    System.out.println("\n TreeMap Print AscendingOrder:\n" +tmp);
    
    Object object = tmp.get(1103);
    System.out.println("\n Get keyValue:"+object);
    
    Collection values = tmp.values();
    System.out.println("\n Only Get values:"+values);
    
    Set keySet = tmp.keySet();
    System.out.println("\n Only Get Keys:" +keySet);
	
    Set <Entry<Integer,String>> entrySet = tmp.entrySet();
    System.out.println("\n EntrySet \n"+entrySet);
    
    //iterate map
    for(Entry<Integer,String> x:entrySet ) {
  
    	System.out.println("\n"+x);
    }
    
    //another iterate method we can change key value
    Set s2 = tmp.entrySet();
    Iterator i = s2.iterator();
    while(i.hasNext()) {
    	Map.Entry me=(Map.Entry)i.next();
    	//System.out.println(i.next());
    	if(me.getKey().equals(111)) {
    		me.setValue("Ragavi");
    		System.out.println("\n Updated:"+me);
    	}
    
    	
    }
//	LinkedHashMap llp=new LinkedHashMap();
//	llp.put(1101, "Passed");
//	llp.put("Fail", 1103);
//	llp.put(true, 'F');
//	System.out.println(llp);

	
	}	
}
