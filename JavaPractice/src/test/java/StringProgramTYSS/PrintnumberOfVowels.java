package StringProgramTYSS;

public class PrintnumberOfVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "india";
		int count=0;
		char[] ch = str.toCharArray();
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]=='i' || ch[i]=='n' || ch[i]=='d' || ch[i]=='i' || ch[i]=='a') 
			{
			count++;
			System.out.println(ch[i]+" ");
			}}
			System.out.println(count);
			}}	
