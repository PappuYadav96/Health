package StringProgramTYSS;

public class FindMaximumLengthinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] s = {"abcde","avbc","qfq","ab","ewreep"};    //ewreep
		
		
		String  maxlength=s[0];
		for(int i=0; i<s.length;i++)
		{
			if(s[i].length()>maxlength.length())
			{
			maxlength=s[i];
					}
			}
		for(int i=0; i<s.length; i++)
		{
			if(s[i].length()==maxlength.length())
			{
				System.out.println(s[i]);
			}
			
		}}
}