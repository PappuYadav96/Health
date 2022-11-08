package IMPORTANT_JAVA_PROGRAM_PAVAN_SDET;

import java.util.Arrays;

public class CheckArraysEqaual {

	public static void main(String[] args) {

		int a1[]= {1,2,3,4,5};
		int a2[]= {1,2,3,4,6};

		boolean status =Arrays.equals(a1, a2);  // to compare the arrays I used this eqauls method

		if(status==true)  // if returns true means both arrays are equal , if returns false means both array are not equal

		{
			System.out.println("Arrays are eqaul");
		}
		else
		{
			System.out.println("Arrays are Not eqaul");
		}
	}}