package Interface2;

public interface USBank {

	int min_bal=100;    // Interface variable are by default Static in nature

	public void debit(); // these are abstract method-----------> it means without method body

	public void credit();

	public void transfermoney();

	// no method body, only method declaration
	// method prototype
	// we can't create the object of interface
	// static methods are not allowed
	// but interface variables are static in nature by default.
	
	
}
