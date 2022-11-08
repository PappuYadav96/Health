package IMPORTANT_JAVA_PROGRAM_PAVAN_SDET;

public class MissingNumberInArray {

	public static void main(String[] args) {

		// Array should not have duplicate
		// Array no need to be sorted order
		//Values Should be in range	
		
		int a[]= {1,2,4,5};    // 1+2+4+5=12 Sum1 , //1+2+3+4+5= 15 Sum2  , sum2-sum1=3 missing number
	int sum1=0;
		for(int i=0; i<a.length;i++)
		{
			sum1= sum1+a[i];
		}
		System.out.println("Sum of elements in array:"+sum1);

	int sum2=0;
		for(int i=1; i<=5; i++)  // i=1 because each and every element I am Capturing
		{
			sum2= sum2+i;
		}
		System.out.println("Sum of range  elements in array:"+sum2);
		System.out.println("Missing Number is:" +(sum2-sum1));
	}

}
   