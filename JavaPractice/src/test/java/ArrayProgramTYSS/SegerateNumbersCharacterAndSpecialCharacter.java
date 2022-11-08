package ArrayProgramTYSS;

public class SegerateNumbersCharacterAndSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "a$#1sv%2" ;
		String alpha =" ";
		String num=" ";
		String spc=" ";
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				alpha =alpha+s.charAt(i); // alpha = asv
			}
			else if (s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				num= num+s.charAt(i)	;
			}
			else
			{
				spc =spc+s.charAt(i);
			}}
		System.out.println(alpha+num+spc);
	}}