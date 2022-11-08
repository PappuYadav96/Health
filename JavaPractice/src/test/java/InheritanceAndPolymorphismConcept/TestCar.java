package InheritanceAndPolymorphismConcept;

public class TestCar {

	public static void main(String[] args) {

		// Static Polymorphism----Compile time Polymorphism
		//BMW is publicly defined so we create object
		BMW b = new BMW();
		b.Start(); // BMW Class
		b.Stop(); // Stop method is in Car Class ( this method is inheriting from parent class Car Class)
		b.refuel(); // this method is inheriting from parent class Car Class
		b.theftSafety();  // its Seperate method of BMW Class

		b.Engine(); // Engine method is getting call from Vehicle Class


		Car c = new Car();
		c.Start();
		c.Stop();
		c.refuel();
		// c.theftsafety we can't call this method because TheftSafety is present in BMW Class


		//Top Casting: BMW Class is reffered by Parent class
		Car c1= new BMW(); // Child Class Object can be referred by parent class reference variable---Dynamic Polymorphism or Run time Polymorphism
		c1.Start();  // Child class method
		c1.Stop();   // child class method
		c1.refuel();

		//Down Casting:Parent class object can be refered by child class reference variable
		BMW b1= (BMW)new Car();  //Run time it will be give class cast exception

	}

}
