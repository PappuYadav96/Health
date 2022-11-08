package JavaOppsConcept;

public class LocalAndGlobalVariable {

	//Global Variable------or Class variable(Throughout the Program we can use the global variable any time)
	String name= "Tom";
	int age= 25;

	public static void main(String[] args) {

		int i=10;   //Local Variable for main method
		System.out.println(i);    //Local Variable we can call them directly.(Don't required Object Creation)
		LocalAndGlobalVariable obj=new LocalAndGlobalVariable();    // We have to access Global Variable by creating an Object by using ClassName

		System.out.println(obj.name);
		System.out.println(obj.age);
	}

	public void sum() {
		int i=15;  //Local Variable for sum method
		int j=20;
		int age= 25;


	}


}
