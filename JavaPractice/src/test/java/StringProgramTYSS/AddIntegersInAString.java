package StringProgramTYSS;

public class AddIntegersInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "b2c3d1";    // outpot is 6
		int sum=0;   // 0 ,2,5,6
		for(int i=0; i<s.length(); i++)
		{
			//i=0  0<6 true
			//i=1  1<6 t
			//i=2  2<6 t
			//i=3  3<6 t
			//i=4  4<6 t
			//i=5  5<6 t
			//i=6  6<6 false  terminate
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				int n=s.charAt(i)-48;    //(Bydefault i have to take -48 its constant)  //50-48=2,51-48=3,49-48=1
				sum=sum+n;           //sum=0+2=2, 2+3=5, 5+1=6
			}}
		System.out.println(sum);
	}
}