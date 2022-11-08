package Java;

public class SecondMinimumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[] arr = {1,2,94, 54, 98, 98, 6, 86, 4}	;
		int fmin = arr[0];  //1
		int smin = arr[0];  //1
		for(int i =0; i<arr.length; i++) {
			if (arr[i]<= fmin) {

				if(arr[i]!= fmin) {
					smin= fmin;

				}
				fmin = arr[i];
			}
			else if (fmin == smin || arr[i]<smin) {
				smin = arr[i];
			}}

		System.out.println("First Min Value ===>"+fmin);	 
		System.out.println("Second min value===>"+smin);
	}

}
