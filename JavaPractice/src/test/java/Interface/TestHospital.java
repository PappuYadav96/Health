package Interface;

public class TestHospital {

	public static void main(String[] args) {


		ApolloHospital ap = new ApolloHospital(); // I Create a Object of ApolloHospital Class(child) I Can access all the method which are overridden or Non Overridden in ApolloHospital class
		// 1) I Create the object of class and call the method
		ap.ambulanceServices();
		ap.emergencyServices();
		ap.ENTServices();
		ap.medicalInsurance();
		ap.neuroServices();
		ap.oncologyServices();
		ap.OPTServices();
		ap.orthopedicServices();
		ap.pathologyServices();
		ap.peditriServices();
		ap.physioServices();

		System.out.println("ap.min_fee");
		System.out.println(USMedical.min_fee);

		// Last Step
		USMedical.Services_911();
		ap.MedicalInternship();

		ap.getPatientHistory();  // we can access the parent class data 
		
		

		// 2) Top Casting Or Up Casting ( Top Casting Means Child class object can be referred by parent interface reference variable)
		// I Cant't create the object of interface but i can create a reference 
		USMedical us= new ApolloHospital();
		us.physioServices();
		us.oncologyServices();
		us.orthopedicServices();

		us.MedicalInternship();

		UKMedical uk= new ApolloHospital();
		uk.ambulanceServices();
		uk.ENTServices();

		//Down Casting is not possible in the case of interface( Down Casting: Compile time it was allowed but at the run time it will give error Class Cast Exception)

	}

}