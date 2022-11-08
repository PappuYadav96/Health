package CollectionProgram;

import java.util.LinkedList;


public class LinkedLis 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Object> list = new LinkedList <Object>();
		list.add(10);
		list.add("hi");
		list.add(null);
		list.add(10);
		list.add(20);
		list.addFirst("bye");
		list.addLast("ku");
		System.out.println(list);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.get(1));
		System.out.println(list.removeFirst());
		System.out.println(list.remove(1));
		System.out.println(list.removeLast());
		System.out.println(list.removeLastOccurrence(10));	
		System.out.println(list.removeFirst());	
		System.out.println();


	}

}
