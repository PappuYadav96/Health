package Interface;

public interface USMedical extends WHOInterface {

	int min_fee= 10;  // it will be consider as static 
	public void physioServices();    // This is Abstract method which don't have static keyword
	public void oncologyServices();
	public void orthopedicServices();

	public void RadiologyServices();  // at last US Medical added extra services
	
	// I can't create the object of Interface
	// Only method declaration ---->method prototype--->No Method body---- This type of method also called as Abstract method(Which don't have method body)
	// I Can't Create Static Prototype Method in Interface
	//but Static Variables are Static and Final by Default 

	//static method with method body:
	//From JDK 1.8, You Can have static methods in interface but with method body
	public static void Services_911() {
		System.out.println("US--911 services......."); // Static method can't be overridden


	}
	default void MedicalInternship() {
		System.out.println("US----MedicalInternship .......");
	}









}
