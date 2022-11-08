package Interface2;

public class ICICIBank extends Finance implements USBank, RBI {      // The Combination of single classes and multiple interfaces are allowed but multiple classes are not allowed

	// These are RBI Interface
	@Override
	public void educationLoan() {
	System.out.println("icici-------educationloan");
		
	}

	@Override
	public void HomeLoan() {
		System.out.println("icici-------homeloan");
		
	}

	@Override
	public void CarLoan() {
		System.out.println("icici-------carloan");
		
	}

	
	// These are USBank Interface
	@Override
	public void debit() {
		System.out.println("icici-------debit");
		
	}

	@Override
	public void credit() {
		System.out.println("icici-------credit");
		
	}

	@Override
	public void transfermoney() {
		System.out.println("icici-------transfermoney");
		
	}

	@Override // added this facility Later by RBI
	public void trading() {
		System.out.println("icici------trading");
		
	}
   //ICICI Bank Class methods(This facility only for ICICI Bank)
	//these are not overridden method
	public void mutualFunds() {
		System.out.println("icici-----mutualfunds");
	}
	
	public void insurance() {
		System.out.println("icici-------insurance");
	}
}
