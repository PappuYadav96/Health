package IMPORTANT_JAVA_PROGRAM_PAVAN_SDET;

public class SumOfArray {

	public static void main(String[] args) {
		
		
		// By using For Loop
		int a[]= {5,2,7,9,6};   // n-5           n-1=4
		
		int sum=0;
		
		
		for(int i=0; i<=a.length-1; i++)    //a.length-1=4       0 1 2 3 4 
		{
			
			sum=sum+a[i];  //5+2+7+9+6
		}
		System.out.println("Sum of Array elements:"+sum);
		
	}

}
