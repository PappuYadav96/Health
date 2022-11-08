package CollectionProgram;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;

public class Hashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer ,String > map = new HashMap<Integer,String>();
		
		map.put(10, "hi");
		map.put(20, "hello");
		map.put(30, "how");
		map.put(40, "are");
		map.put(50, "you");
		map.put(60, "bye");
		map.put(10, "yes");
		map.put(70, "hello");
		map.put(null, null);
		
		System.out.println(map);
		System.out.println(map.remove(20));
		System.out.println(map.size());
		System.out.println(map.containsKey(5));
		System.out.println(map.containsValue("bye"));
		System.out.println(map.replace(30, "super"));
		System.out.println(map.get(10));
		System.out.println(map);
		
		for(Entry<Integer ,String> m: map.entrySet()) {
		
		System.out.println(m.getKey() + " " +m.getValue());
		}	
	}

}
