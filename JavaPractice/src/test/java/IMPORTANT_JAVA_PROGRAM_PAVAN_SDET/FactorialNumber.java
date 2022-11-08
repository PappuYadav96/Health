package IMPORTANT_JAVA_PROGRAM_PAVAN_SDET;

public class FactorialNumber {

	public static void main(String[] args) {          // A Factorial is a function that multiplies a number by every number.

		// I Can Use While loop or For loop.	
		
		int num=3; 
		long factorial =1;     // 3!= 1*2*3=6  (lower to higer, 1 to 3)

		for(int i=1; i<=num; i++)

		{
			factorial = factorial*i;   // This will calculate the factorial	
		}	

		System.out.println("Factorial of a number is:"+ factorial);
	}

}
