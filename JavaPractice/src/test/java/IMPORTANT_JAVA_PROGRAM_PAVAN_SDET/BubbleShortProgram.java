package IMPORTANT_JAVA_PROGRAM_PAVAN_SDET;

import java.util.Arrays;

public class BubbleShortProgram {

	public static void main(String[] args) {

		int a[]= {4,2,1,5,3}; // Two for loop will be used here.---> one for loop for number of passes n-1 and another for loop to compare and swap
		// Bubble sort is used--> if 1st element is greater than 2nd element means adjacent element-->example 4,2--possible--->and if 1st element is less than 2nd element than bubble sort is not applicable example---> 2,4 not possible
		System.out.println("Array before sorting:"+Arrays.toString(a));

		int n=a.length;  // This will give length of array
		for(int i=0; i<n-1; i++) // This for loop is for number of passes
		{

			for(int j=0;j<n-1; j++) // This for loop is for itreation of each pass, This loop will execute 5 times
			{
				if(a[j]>a[j+1])
				{
					int temp =a[j];  // I used one temporary variable
					a[j]= a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Array After sorting:"+Arrays.toString(a));
	}

}
