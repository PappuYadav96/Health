package StringProgramTYSS;

import java.util.LinkedHashSet;

public class OrderofOccuranceofDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "tester";
		LinkedHashSet<Character> set = new LinkedHashSet<Character> (); //to remove duplicate
		for(int i =0; i<s.length(); i++)
		{
			set.add(s.charAt(i));
		}
		for(Character ch: set)
		{
			int count=0;
			for(int i =0; i<s.length(); i++)
			{

				if(ch==s.charAt(i))
				{
					count++;
				}}
			System.out.println(ch+" is repeating "+count+"time");
		}
	}}