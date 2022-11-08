package IMPORTANT_JAVA_PROGRAM_PAVAN_SDET;

public class MaximumAndMiniumuElementinArray {

	public static void main(String[] args) {
	
		int a[]= {50,30,40,20,60};
		int max=a[0];  // 50
		for(int i=1; i<a.length; i++)
		{
		
		if(a[i]>max)    //// 30>50 False , 40>50 F , 20>50 F, 60>50 True
		
		{
			max=a[i];   
		}
		}System.out.println("Maximum element in array is:"+max);
		
	}

}
