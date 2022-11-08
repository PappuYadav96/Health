package StringProgramTYSS;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String s = "welcome";
		System.out.println(s.length());

		String st = "welcome";
		System.out.println();





		String s1 = "hi";
		String s2 = "hello";
		String s3 ="welcome";
		String joined = String.join()





				String s ="welcome";
		System.out.println(s.startsWith("we"));

		String s1 = "welcome";
		String s2="";
		System.out.println(s2.isBlank());  //true



		String s1 =" welcome";
		String s2= "";
		System.out.println(s1.isEmpty());  //false


		Strings1 =" hi hello welcome";
		System.out.println();








		String s1 = "hi hello welcome";
		String[] s= s1.split(" ");
		for(int i = 0; i<s.length; i++)
		{
			System.out.println(s[i]);
		}
		String s ="hi";
		String s1="hi";
		System.out.println(s.equals(s1));



		String s = "hi hello welcome";
		System.out.println(s.replace(" ", " "));

		String s = "WELCOME";
		System.out.println(s.toLowerCase());

		String s = "welcome";
		System.out.println(s.toUpperCase());



	}

}
