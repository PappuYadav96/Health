package Interface2;

public class TestBank {

	public static void main(String[] args) {
		// For interface object creation is not allowed
		// USBank us = new USBank();  -----------it will give error

		ICICIBank ic= new ICICIBank(); //object creation
		ic.educationLoan(); // these are overridden method
		ic.HomeLoan();
		ic.CarLoan();


		// these are overridden method i am calling from USBank 
		ic.credit();
		ic.debit();
		ic.trading();
		ic.transfermoney();

		// i am calling seperate method of ICICI Bank
		ic.mutualFunds();
		ic.insurance();
	
		//Static variable are called by Class name
		System.out.println(USBank.min_bal);
		
		USBank us=new ICICIBank();  // Reference variable, we can refer to child class object
		// USBank is refernce variable
		us.credit();
		us.debit();
		us.transfermoney();

		
		
		
		
		
	}

}
