package Java;

public class SwappingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int a = 20;
		int b = 10;
		System.out.println("Before Swap =====> A value is ="+a+" & B value is ="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swap =====> A value is ="+a+" & B value is ="+b);
	}

}
