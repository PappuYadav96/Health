package StringProgramTYSS;

public class DesiredReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String st="I love Bangalore City";    //Output should be I evol erolagnaB ytiC

		String[] str=st.split(" ");

		for(int i=0; i<str.length-1;  i++)
		{
			String s = str[i];
			for(int j=s.length()-1; j>=0; j--)
			{
				System.out.print(s.charAt(j)+" ");
			}

			//System.out.print(" ");
		}	
	}}
