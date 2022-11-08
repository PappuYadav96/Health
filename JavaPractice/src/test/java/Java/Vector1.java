package Java;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Vector<Object> voc = new Vector();	
		voc.add(10);
		voc.add(20);
		voc.add(10);
		voc.add("hi");
		voc.add(null);
		voc.add(null);
		System.out.println(voc);
		System.out.println(voc.firstElement());
		System.out.println(voc.lastElement());
		System.out.println(voc.indexOf("hiii"));
		voc.add(4, "heloo");
		System.out.println(voc);	
	}

}











