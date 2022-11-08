package JavaOppsConcept;

public class StaticAndNonStaticProgram {

	// Global Variables: the scope of global variables will be available across all the functions with same conditions.
	String name= "Tom";  //Non static Global Variable
	static int age=25;  //Static Global Variable


	public static void main(String[] args) {

		// How to Call static method and variables: there are two ways
		// 1) Direct Calling
		Sum();

		//2) Calling by Classname
		StaticAndNonStaticProgram.Sum();

		System.out.println(age);    // Direct Call
		System.out.println(StaticAndNonStaticProgram.age);  // By using class name


		// How to Call Non Static methods and Variables: By Creating an Object-------> Using Class Name
		StaticAndNonStaticProgram obj = new StaticAndNonStaticProgram();
		obj.sendMail();
		System.out.println(obj.name);

		//Can i access static method by using object reference?------> Yes
		obj.Sum();

	}

	public void sendMail() {          // Non Static Method
		System.out.println("send mail method");
	}

	public static void Sum() {        // static method
		System.out.println("Sum method");
	}
}
