package Java;

public class FirstMaxWithoutSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {12,54,3,6,86,4};	

		int fmax = arr[0];
		for(int i =0; i<arr.length; i++) {
			if (arr[i]> fmax) {

				fmax = arr[i];
			}
		}
		System.out.println("First Max value ====>"+fmax);

	}

}
 