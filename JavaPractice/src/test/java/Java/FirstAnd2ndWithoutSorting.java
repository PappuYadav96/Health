package Java;

public class FirstAnd2ndWithoutSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {2,3,9,5,1};	

		int fmin = arr[0];
		for(int i =0; i<arr.length; i++) {
			if (arr[i]< fmin) {
				fmin = arr[i];
			}
		}
		System.out.println("First Min value ====>"+fmin);
	
	}

}
