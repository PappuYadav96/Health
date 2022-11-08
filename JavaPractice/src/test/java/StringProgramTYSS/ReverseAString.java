package StringProgramTYSS;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1st way to print reverse o/p
		String s ="PATNA";
		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.print(s.charAt(i));	
		}

	}}
//
//	//2nd  way to print reverse o/p
//	String st = "welcome";
//	char[] s1 = st.toCharArray();
//	int count =0;
//	for(char c:s);
//	{
//		count++;
//	}
//	for(int i = count-1; i>=0; i--)
//
//	{
//		System.out.println(s1[i]);
//
//
//
//		//3rd way to print reverse o/p
//
//		String s= "welcome";
//		String rev="";
//		for(int i=s.length()-1; i>=0; i--)
//
//		{
//			rev =rev+s.charAt(i);
//			System.out.println(rev);
//		}
//	}}
//
//
//
////4th  way to print reverse o/p
//String s= "welcome";
//StringBuffer sb = new StringBuffer(s);
//{
//	sb.reverse();
//	System.out.println(sb);	
//}}
