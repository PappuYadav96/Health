package Java;

public class FindMaximumNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {50,30,40,20,60,80};
		int max = a[0];     //50
		for(int i =1; i<a.length; i++)   //80
		{
			if(a[i]>max)        // for minimum change only symbol a[i]<min
			{
				max=a[i];     //80
			}
		}
		System.out.println("maximum element is array is:"+ max);		
	}

}
