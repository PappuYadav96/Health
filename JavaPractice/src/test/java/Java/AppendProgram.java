package Java;

public class AppendProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to seperate 0 and 1
		int [] arr= {2,0,1,3,0,0};
		int [] temp = new int[arr.length];
		int m = 0;
		int n= arr.length/2;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==0) {
				temp[m]=0;
				m++;
			}
			else {
				temp[n]= arr[i];
				n++;
			}
		}
		for (int i = 0; i < temp.length; i++) {


			System.out.print(temp[i]+" ");
		}
	}

}
