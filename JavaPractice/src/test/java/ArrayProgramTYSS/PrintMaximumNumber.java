package ArrayProgramTYSS;

public class PrintMaximumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[] in = {12345678,12324,123,14};


		int  maxlength=in[0];
		for(int i=0; i<in.length;i++)
		{
			if(in[i]>maxlength)
			{
				maxlength=in[i];
			}
		}
		for(int i=0; i<in.length; i++)
		{
			if(in[i]==maxlength)
			{
				System.out.println(in[i]);
			}
		}}}