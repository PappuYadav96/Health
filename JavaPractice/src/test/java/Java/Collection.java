package Java;

import java.util.ArrayList;
import java.util.Collections;

public class Collection {

	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>();

		list.add(10);
		list.add(20);
		list.add(10);
		list.add("hi");
		list.add(null);
		list.add(null);
		System.out.println(list);
		list.add(2, "hello");
		System.out.println(list);

		ArrayList<Integer> list2 = new ArrayList<Integer>();

		list2.add(20);
		list2.add(5);
		list2.add(1);
		list2.add(30);
		Collections.sort(list2);
		System.out.println(list2);
		list.add(list2);
		System.out.println(list);
		if(list.contains("hi"))
		{
			System.out.println("is present");
		}
		else {

			System.out.println("not present");
		}
		System.out.println(list.remove(1));
		for(Object obj:list)
		{
			System.out.println(obj);   
		}
	}
}
