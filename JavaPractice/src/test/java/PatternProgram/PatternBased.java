package PatternProgram;

public class PatternBased {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		for(int i=1; i<=n; i++)

			//i =1 1<=5true
			//i =2 2<=5true
			//i =3 3<=5true
			//i =4 4<=5true
			//i =5 5<=5true
			//i=6 6<=6 terminate
		{
			for(int j=1; j<=n; j++)

				//j =1 1<=5true
				//j =2 2<=5true
				//j =3 3<=5true
				//j =4 4<=5true
				//j =5 5<=5true
				//j=6 6<=6 terminate

			{
				System.out.print("*");
			}
			System.out.println();
		}}
}
