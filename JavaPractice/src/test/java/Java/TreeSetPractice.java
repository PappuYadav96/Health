package Java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	TreeSet<Integer> Set = new TreeSet<>();	
		
		Set.add(60);
		Set.add(40);
		Set.add(30);
		Set.add(20);
		Set.add(10);
		Set.add(80);
		Set.add(70);
		System.out.println(Set);
		ArrayList<Object> list = new ArrayList<Object>(Set);
		list.add("hii");
		list.add("hello");
		list.add("bye");
		list.add(10);
		System.out.println(list);
		System.out.println(list.get(4));
		System.out.println(Set.first());
		System.out.println(Set.last());
		System.out.println(list.remove(3));
		System.out.println(list.set(3, "hihello"));
		System.out.println(Set.descendingSet());
		System.out.println();
		Iterator<Object> i = list.iterator();
		while(i.hasNext()) {
		System.out.println(i.next());
		
		}}}