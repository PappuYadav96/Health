package StringProgramTYSS;

import java.util.Scanner;

public class FindFactorialOfaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			for(; ;)             //1st way by using scanner class
			{
				Scanner sc = new Scanner(System.in);
				int n= sc.nextInt();
				int fact =1;
				for(int i=n; i>=1; i--)
				{
					fact= fact*1;
					System.out.println(fact);
				}
			}
		}}}
		
		
		
// 2nd way		
//		int n=5; //5*4*3*2*1=120
//
//		int fact=1;
//		for(int i=1;i<=n; i++)
//		{
//			fact =fact*i;	
//		}
//		System.out.println(fact);
//	}
//
//}
