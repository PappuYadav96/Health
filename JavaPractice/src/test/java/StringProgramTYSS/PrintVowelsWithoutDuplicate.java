package StringProgramTYSS;

import java.util.LinkedHashSet;

public class PrintVowelsWithoutDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "india";
		char[] ch = str.toCharArray();
		LinkedHashSet<Character> set = new LinkedHashSet<> ();
		for(int i=0; i<ch.length; i++)
		{	
			set.add(ch[i]);
		}
		int count=0;
		for(Character ch1: set)
		{
			if(ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u') 
			{
			count++;
			System.out.print(ch1);
			}}
			System.out.print("="+count);
			}	
}