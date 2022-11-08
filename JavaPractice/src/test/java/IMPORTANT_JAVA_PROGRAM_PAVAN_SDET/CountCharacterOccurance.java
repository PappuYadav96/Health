package IMPORTANT_JAVA_PROGRAM_PAVAN_SDET;

public class CountCharacterOccurance {

	public static void main(String[] args) {

		String str ="Java Programming Java Oops";

		int totalcount=str.length();  // total length of string	

		int totalcount_afterRemove=	str.replace("J", "").length() ; // total length after removing
		int count= totalcount-totalcount_afterRemove;
		System.out.println("Number of occurance of J is:"+count);
	}

}
