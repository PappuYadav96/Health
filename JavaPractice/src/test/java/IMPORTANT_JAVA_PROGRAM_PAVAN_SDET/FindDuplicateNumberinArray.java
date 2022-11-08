package IMPORTANT_JAVA_PROGRAM_PAVAN_SDET;

public class FindDuplicateNumberinArray {

	public static void main(String[] args) {
		
		
	String arr[]= {"Raju","Ankit","Ranjan","Raju"};
		
// Approach 1
	
	for(int i=0; i<arr.length; i++)
	{
		for(int j=i+1; j<arr.length;j++)
		{
			if(arr[i]==arr[j])   // For Compare
			{
				
				System.out.println("Found Duplicate Number:"+arr[i]);
			}
		}
			
			
	}
	}}