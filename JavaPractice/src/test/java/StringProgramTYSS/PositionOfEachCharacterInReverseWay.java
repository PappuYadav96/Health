package StringProgramTYSS;

import java.util.LinkedHashSet;

public class PositionOfEachCharacterInReverseWay {

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
			for(int i=s.length()-1; i>=0; i--) //(for printing position with removing first duplicate)
			{
				if(ch==s.charAt(i))
				{	
					System.out.println(ch+" "+(i+1));	
					break;	

				}}}}}