package StringProgramTYSS;

import java.util.LinkedHashSet;

public class RemoveTheDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String str = "I love love I Bangalore city";
	String[]s= str.split("");
	LinkedHashSet<String> set= new LinkedHashSet<>();
	for(int i=0; i<s.length; i++)
	{
		set.add(s[i]);
	}
	for(String stri:set) {
	
	System.out.print(stri+"");
	
}}}