package Java;

public class additionofTwonumber
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {4,2,1,3};
		int[]b= {1,2,3,4,5};
		int length = a.length;  //5
		if(a.length<b.length) {    //5<4

			length = b.length;
		}
		for(int i=0; i<length; i++)  // i=0 0<5t, i=1  1<5t ,i=2 2<5t, i=3 3<5t , t=4 4<5t
		{		
			try {
				System.out.print(a[i]+b[i]);   //5 4 4 7 aaray index out of bound Exception
			}catch(Exception e) {

				if(a.length<b.length) // 5<4f
				{
					System.out.print(b[i]);
				}
				else {
					System.out.print(a[i]);  //5
				}
			}
		}}}

