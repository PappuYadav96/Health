package InterviewProgramsPracticeTYSS;

public class Sumofdigitswithoutusingloops
{
	private static int sum;
	public static void main(String[] args)
	{
    int number= 5678;
   sum= add(number);
    System.out.println("sum of digits "+number+" is "+sum);
	}
	
	public static int add(int number) {
		int last = number%10;
		//By using Recursion method
		sum = sum+last;
		if(number>0)
		return add(number/10);
		else
			return sum;
		
	}
	
}	
	
	
	
	
	
	
	
