package StringProgramTYSS;

public class FibonaciiSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Print 0,1,1,2,3,5,8,13,21	


		//1st way

		//		int a=0;
		//		int b=1;
		//		System.out.print(a+" "+b);
		//
		//		for(int i=0; i<=6; i++)
		//		{
		//
		//			int c=a+b;
		//			System.out.print(" "+c);
		//
		//			a=b;
		//			b=c;
		//
		//		}}}




		//2nd way

		int fib1=0;
		int fib2=1;
		int fib3;
		for(int i =0; i<=6; i++)
		{
			fib3=fib1+fib2;
			fib1=fib2;
			fib2=fib3;
			System.out.print(fib3);
		}

	}}