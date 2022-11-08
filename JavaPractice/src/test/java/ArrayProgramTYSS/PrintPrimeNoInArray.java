package ArrayProgramTYSS;

public class PrintPrimeNoInArray {

	public static void main(String[] args) {

		int[] a= {1,2,3,4,5,6,7,8,9};

		for(int i=0; i<a.length; i++)
			// i=4 4<9 true
		{
			int n=a[i];              //n=5
			int j=2;             //j=2 3 4 5
			while(j<=n)            //2<=5 true
			{
				if(n%j==0)               //5%5==0
				{
					break;
				}
				else
				{
					j++;
				}}

			if(j==n)          //2==2  3==3  5==5
			{
				System.out.println(n);   //2 3 5
			}
		}
	}}