package CollectionProgram;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class Linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<Object> Set = new LinkedHashSet<>();
		Set.add(10);
		Set.add(20);
		Set.add("hiii");
		Set.add("hello");
		Set.add(null);
		Set.add(null);
		Set.add('A');
		System.out.println(Set);
		System.out.println(Set.isEmpty());
		System.out.println(Set.remove(20));
		System.out.println(Set.size());
		if(Set.contains("hiii"))
		{
			System.out.println("present");
		}
		else {
			System.out.println("not present");
		}
		for(Object obj: Set){  //using for- each loop fetching data
			{
				System.out.println(obj);

			}
			System.out.println();
			Iterator<Object> i = Set.iterator()	;
			while(i.hasNext()) 
				System.out.println(i.next());
		}

	}}