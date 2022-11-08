package StringProgramTYSS;

import java.util.LinkedHashSet;

public class PositionOfEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String str ="I love I love Bglr City";
		String[] s = str.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String> ();
		for(int i=0; i<s.length; i++)
		{
			set.add(s[i]);
		}
		for(String stri: set)
		{
	
			for(int i=0; i<s.length; i++)
			{
				if(stri.equals(s[i])) {
				
			System.out.println(stri+" is prsent in "+(i+1)+" position");
			break;

		}}}}}
		
