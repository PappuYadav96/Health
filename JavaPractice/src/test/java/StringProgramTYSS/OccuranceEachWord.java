package StringProgramTYSS;

import java.util.LinkedHashSet;

public class OccuranceEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="I love I love Bglr City";
		String[] s = str.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<> ();
		for(int i=0; i<s.length; i++)
		{
			set.add(s[i]);
		}
		for(String stri: set)
		{
			int count =0;
			for(int i=0; i<s.length; i++)
			{
				if(stri.equals(s[i]))
				{
					count++;
				}
			}
			System.out.println(stri+" =is repeating "+count+" time");

		}}}