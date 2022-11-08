package Java;

import java.util.Stack;

public class stack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Object> st = new Stack<Object>();
		st.push(20);
		st.push(10);
		System.out.println(st.pop()); //10
		System.out.println(st.pop());  //20		
	}

}
