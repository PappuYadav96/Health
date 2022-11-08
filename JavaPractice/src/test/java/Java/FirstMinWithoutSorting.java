package Java;

public class FirstMinWithoutSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[] arr = {12,54,3,6,86,4};	

		int fmin = arr[0];
		for(int i =0; i<arr.length; i++) {
			if (arr[i]< fmin) {

				fmin= arr[i];
			}
		}
		System.out.println("First Min value ====>"+fmin);


	}

}
