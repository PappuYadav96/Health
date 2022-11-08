package Java;

public class ThirdMinimumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = {4,1,3,2,5};
		int[] arr = {10,20,30,40,50};
		int thmin = arr[3];
		for(int i =3; i<arr.length; i++) {
			if (arr[3]< thmin) {

				thmin= arr[i];
			}
		}
		System.out.println("third Min value ====>"+thmin);	

	}

}	