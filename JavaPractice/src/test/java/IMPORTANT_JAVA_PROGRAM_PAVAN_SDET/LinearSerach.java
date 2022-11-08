package IMPORTANT_JAVA_PROGRAM_PAVAN_SDET;

public class LinearSerach {

	public static void main(String[] args) {


		int a[]= {10,20,40,50,30} ; // total 5 elements 
		// Output will show Number of position

		int search_ele= 40;
		boolean flag= false;
		for(int i=0; i<a.length; i++)
		{
			//System.out.println(a[i]);

			if(search_ele== a[i])

			{
				System.out.println("Element found at:"+i);

				flag=true;
				break;
			}}	
		if(flag==false)
		{

			System.out.println("Element Not found at");
		}}
}
