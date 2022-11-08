package Java;

import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		PriorityQueue<String> queue =new PriorityQueue<String>();	
		queue.add("hi");
		queue.add("hello");
		queue.add("hihellooo");
		queue.add("bye");
		queue.add("goodbye");
		System.out.println(queue);
		System.out.println(queue.peek()); //fetch and not remove
		System.out.println(queue);
		System.out.println(queue.poll()); //fetch and remove
		System.out.println(queue);	
	}

}
