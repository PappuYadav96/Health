package IMPORTANT_JAVA_PROGRAM_PAVAN_SDET;

import java.util.Random;

public class GenerateRandomNumbersAndString {

	public static void main(String[] args) {


		// Logic1---Random

		//object create for random number
		Random ran= new Random();
		int ran_int=ran.nextInt(100);  
		System.out.println(ran_int); // it will generate Random Number from 0 to 99

		
		// This is for Generate Decimal Number
//	    double ran_dbl=	ran.nextDouble(); // range 0.0 and less than 1.0
//		System.out.println(ran_dbl);
	
		
		// Approach 2----->For Generate Random Decimal Number
		System.out.println(Math.random());
		
		
	}

}
