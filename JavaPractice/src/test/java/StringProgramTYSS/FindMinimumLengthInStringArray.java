package StringProgramTYSS;

public class FindMinimumLengthInStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] s = {"abcde","avbc","qfq","ab","ewree"};    //ab
		
		
		String  minlength=s[0];
		for(int i=0; i<s.length;i++)
		{
			if(s[i].length()<minlength.length())
			{
			minlength=s[i];
					}
			}
		for(int i=0; i<s.length; i++)
		{
			if(s[i].length()==minlength.length())
			{
				System.out.println(s[i]);
			}
			
		}}}