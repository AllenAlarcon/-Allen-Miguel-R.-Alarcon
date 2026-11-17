package Allen_Project;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = new ArrayList<>();
		 fruits.add("Apple");
		 fruits.add("Orange");
		 fruits.add("Strawberry");
		 fruits.add(1, "Blueberry"); // insert at index 1
		 System.out.println(fruits); // [Apple, Blueberry, Banana, Cherry]
		 System.out.println(fruits.get(2)); // Banana
		 System.out.println(fruits.size()); // 4
		 fruits.set(0, "Apricot"); // replace Apple
		 fruits.remove("Strawberry"); // remove by value
		 fruits.remove(0); // remove by index
		 System.out.println(fruits.contains("Banana")); // true
		 System.out.println(fruits); // [Blueberry, Banana]
		 


	}//end of main method

}//end of class
