package StringProgramTYSS;

import java.util.LinkedHashSet;

public class PrintNotVowelisPresentnAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "india";
		int count=0;
		char[] ch = str.toCharArray();
		LinkedHashSet<Character> set = new LinkedHashSet<Character> ();
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u') 
			{
			count++;
			System.out.print(ch[i]);
			}}
			System.out.print(count);
			}}