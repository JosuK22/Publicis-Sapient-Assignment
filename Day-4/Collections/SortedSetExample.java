package assignmentDay4;

import java.util.Set;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    
	public static void main(String[] args) {
	    
		SortedSet<String> capitals=new TreeSet<String>();
		
		capitals.add("Delhi");
		capitals.add("Hyderabad");
		capitals.add("Bangalore");
		capitals.add("Kolkata");
		capitals.add("Mumbai");
		capitals.add("Jaipur");
		capitals.add("Chennai");
		capitals.add("Lucknow");
		capitals.add("Kochi");
		capitals.add("Patna");
		
		System.out.println(capitals);
		
		capitals.add("Hyderabad");
		capitals.add("Delhi");
		System.out.println(capitals);

		System.out.println(capitals.contains("Hyderabad"));
		capitals.remove("Jaipur");
		
		System.out.println(capitals);
		System.out.println("-----------");
		
		Iterator<String> itr=capitals.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-----------");
		
		for(String capital:capitals) {
			System.out.println(capital);
		}		
	}
}