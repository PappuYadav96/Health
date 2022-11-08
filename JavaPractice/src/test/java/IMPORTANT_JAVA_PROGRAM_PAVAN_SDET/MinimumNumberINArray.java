package IMPORTANT_JAVA_PROGRAM_PAVAN_SDET;

public class MinimumNumberINArray {

	public static void main(String[] args) {
	

		
		int a[]= {50,30,40,20,60};
		int min=a[0];  // 50
		for(int i=1; i<a.length; i++)
		{
		
		if(a[i]<min)    //// 30>50 False , 40>50 F , 20>50 F, 60>50 True
		
		{
			min=a[i];   
		}
		}System.out.println("Minimum element in array is:"+min);
		
	}}