package IMPORTANT_JAVA_PROGRAM_PAVAN_SDET;

public class ReverseEachWordInAString {

	public static void main(String[] args) {


		String str = "Welcome To Java";   //Original String

		String[] words =str.split(" ");   // Splitting String into words

		String reverseString="";

		for(String w: words)     //Welcome,To,Java
		{
			String reverseword="";
			for(int i=w.length()-1; i>=0; i--)   //Welcome
			{

				reverseword= reverseword+w.charAt(i);
			}
				reverseString=reverseString+reverseword+" ";     // emoclew oT avaJ
			}
				System.out.println(reverseString);
			}}
	

