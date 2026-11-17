package Allen_Project;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> nums = new TreeSet<>();
		 nums.add(50);
		 nums.add(10);
		 nums.add(30);
		 nums.add(10); // duplicate ignored
		 System.out.println(nums); // [10, 30, 50] always sorted
		 System.out.println(nums.first()); // 10
		 System.out.println(nums.last()); // 50
		 System.out.println(nums.lower(30)); // 10 (strictly less than)
		 System.out.println(nums.higher(30)); // 50 (strictly greater than)
		 System.out.println(nums.headSet(30)); // [10]
		 System.out.println(nums.tailSet(30)); // [30, 50]
		 
		 TreeSet<String> byLength = new TreeSet<>(Comparator.comparingInt(String::length));
		 byLength.add("banana");
		 byLength.add("fig");
		 byLength.add("apple");
		 System.out.println(byLength); // [fig, apple, banana]


	}//end of main method

}//end of class
