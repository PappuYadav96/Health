package Java;

public class SecondMaxium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[] arr = {1,2,94, 54, 98, 98, 6, 86, 4}	;
		int fmax = arr[0];  //1
		int smax = arr[0];  //1
		for(int i =0; i<arr.length; i++) {
			if (arr[i]>= fmax) {

				if(arr[i]!= fmax) {
					smax= fmax;

				}
				fmax = arr[i];
			}
			else if (fmax == smax || arr[i]>smax) {
				smax = arr[i];
			}}

		System.out.println("First Max Value ===>"+fmax);	 
		System.out.println("Second max value===>"+smax);
	}
}
