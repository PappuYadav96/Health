package Interface;

public class ApolloHospital extends GlobalPatientData implements USMedical,UKMedical,IndianMedical {

	@Override
	public void physioServices() {
		System.out.println("Ap---physio");


	}

	@Override    //Now we are using Overridden concept of all the eight method
	public void oncologyServices() {
		System.out.println("AP----Oncology");


	}

	@Override
	public void orthopedicServices() {
		System.out.println("AP----orthopedic");


	}

	@Override // Radiology Services Added by US medical
	// Don't Need to override Multiple times this Radiology services because duplicte will be created
	public void RadiologyServices() {
		System.out.println("AP----RadiologyServices");
	}



	@Override
	public void ENTServices() {
		System.out.println("AP--ENTServices");


	}

	@Override
	public void ambulanceServices() {
		System.out.println("AP--ambulanceservices");

	}

	@Override
	public void emergencyServices() {
		System.out.println("AP--emergencyServices");


	}

	@Override
	public void neuroServices() {
		System.out.println("AP--neuroServices");


	}

	@Override
	public void peditriServices() {
		System.out.println("AP--peditriServices");


	}

	//WHO At Last step
	@Override
	public void PolioServices() {

	}

	//non overridden methods i don't use overridden concept

	public void OPTServices() {
		System.out.println("AP--OPTServices");
	}

	public void medicalInsurance() {
		System.out.println("AP---medicalInsurance");
	}
	public void pathologyServices() {
		System.out.println("AP---medicalInsurance");
	}


}