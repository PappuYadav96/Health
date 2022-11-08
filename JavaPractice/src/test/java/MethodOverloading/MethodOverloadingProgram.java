package MethodOverloading;

public class MethodOverloadingProgram {

	public static void main(String[] args) {

		MethodOverloadingProgram obj = new MethodOverloadingProgram();
		obj.sum();    // 0 param
		obj.sum(10); // 1 param
		obj.sum(20, 5);   // 2 param
	}

//MethodOverloading-----> When the method name is same with different arguments or input parameters within the same class is called method overloading.
// Dupicate metods--> same method name with same number of arguments are not allowed
//we can't create a method inside a method
// we can overload the main method in MethodOverloading 
//public static void main(int q)
	
	
	public void sum()   // 0 input param
	{
		System.out.println("Sum method------zero param");
	}

	public void sum(int i)       // 1 input param 
	{
		System.out.println("Sum method-----with 1 input param");
		System.out.println(i);
	}

	public void sum(int k, int l)    //2 input param
	{
		System.out.println("sum method--------with 2 input param");
		System.out.println(k+l);

	}

}
