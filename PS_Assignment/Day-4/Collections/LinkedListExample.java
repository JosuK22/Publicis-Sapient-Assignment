package assignmentDay4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedListExample {
    
	public static void main(String[] args) {
	    
		List<String> names=new ArrayList<String>();
		
		names.add("Steve");
		names.add("Tony");
		names.add("Natasha");
		names.add("Clint");
		names.add("Banner");
		names.add("Thor");
		names.add("Maximoff");
		names.add("Peter");
		names.add("bucky");
		names.add("Stefan");
		names.add("Rhodey");
		
		System.out.println(names);
		names.add(5, "Wong");
		
		System.out.println(names);
		
		System.out.println(names.contains("Maximoff"));
		names.remove(10);
		
		System.out.println(names);
		System.out.println("-----------");
		
		Iterator<String> itr=names.iterator();
		while(itr.hasNext()) {
		    
			System.out.println(itr.next());
		}
		System.out.println("-----------");
		
		ListIterator<String> lstItr=names.listIterator();
		
		while(lstItr.hasNext()) {
		    
			System.out.println("Forward "+lstItr.next());
			
		}
		while(lstItr.hasPrevious()) {
		    
			System.out.println("Backward "+lstItr.previous());
		}
		System.out.println("-----------");
		
		for(String name:names) {
		    
			System.out.println(name);
		}
	}
}