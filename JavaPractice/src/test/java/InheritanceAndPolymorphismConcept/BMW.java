package InheritanceAndPolymorphismConcept;

public class BMW extends Car  // Has-A-Relationship
{

	// Whenever a method is common in child class as well as in parent class then preference will be given to child class method(Start() is same in Car Class and BMW Class	
	// When Same method is present in parent class as well as in child class with the same name and same number of arguments is called as method overridding.
	public void Start() // Overridden method
	{
		System.out.println("BMW-----Start");
	}

	public void theftSafety() {
		System.out.println("BMW-----theftySafety");
	}

}
