package IMPORTANT_JAVA_PROGRAM_PAVAN_SDET;

public class RemoveWhiteSpaceInaString {

	public static void main(String[] args) {

		String str ="My  Name  is  Pappu  Yadav"	;
		str.replaceAll("\\s", "");  // it will replace the spaces
		System.out.println("Before removing the white spaces:"+str);	
		str=str.replaceAll("\\s", "");	
		System.out.println("After removing the white spaces:"+str);
	}

}
