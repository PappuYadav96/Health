package Java;

public class Seperate0and1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		int [] arr= {0,1,1,1,0,1,0};
		int [] temp = new int[arr.length];
		int m = 0;
		int n= arr.length-1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==0) {
				temp[m]=0;
				m++;

			}
			else {
				temp[n]= arr[i];
				n--;
			}
		}
		for (int i = 0; i < temp.length; i++) {


			System.out.println(temp[i]+" ");
		}

	}}