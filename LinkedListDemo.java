package Allen_Project;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> queue = new LinkedList<>();
		 queue.add("B");
		 queue.addFirst("A"); // [A, B]
		 queue.addLast("C"); // [A, B, C]
		 System.out.println(queue.getFirst()); // A
		 System.out.println(queue.getLast()); // C
		 queue.removeFirst(); // [B, C]
		 queue.removeLast(); // [B]
		 System.out.println(queue); // [B]
		 
		 
	}//end of main method

}//end of class
