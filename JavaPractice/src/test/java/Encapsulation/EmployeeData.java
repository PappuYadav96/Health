package Encapsulation;

public class EmployeeData {

	// Encapsulation is also called as Data Hiding.
	// Encapsulation is an OOPS Concept
	//How to implement Encapsulation
	// 1) private Data Variables : so that these variable can not be access directly from outside the class  
	//(ssn social security number)
	private int ssn;
	private String empName;
	private int empAge;


	public static void main(String[] args) {
		EmployeeData emp= new EmployeeData(); //Our Class Name EmployeeData is Non Static so we Create a object
		// 3) set the employee deatils
		emp.setEmpName("Pappu"); // Here I Set the all variables values
		emp.setEmpAge(25);
		emp.setSsn(123456);

		// 4) to print
		System.out.println("Employee name is:"+emp.getEmpName());
		System.out.println("Employee age is:"+emp.getEmpAge());
		System.out.println("Employee SSN is:"+emp.getSsn());

	}
	// 2) public getter and setter methods: to set and get the value of the fields (outside of the class can access that's why we declare as public)
	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;       // this.class variable= local variable
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

}
