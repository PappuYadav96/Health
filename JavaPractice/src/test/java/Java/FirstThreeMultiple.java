package Java;

public class FirstThreeMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5};
		for(int i =0; i<arr.length; i++) {
			for(int j= i; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i]= arr[j];
					arr[j]=temp;
				}
			}
		}
		int mult =1;
		for(int i = 0; i<3; i++) {
			mult=mult*arr[i];
		}
		System.out.println(mult);	

	}

}