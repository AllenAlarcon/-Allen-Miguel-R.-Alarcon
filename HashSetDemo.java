package Allen_Project;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> tags = new HashSet<>();
		 System.out.println(tags.add("java")); // true
		 System.out.println(tags.add("coding")); // true
		 System.out.println(tags.add("java")); // false (duplicate ignored)
		 System.out.println(tags.size()); // 2
		 System.out.println(tags.contains("java"));// true
		 tags.remove("coding");
		 System.out.println(tags); // [java]
		 
		 List<Integer> withDupes = List.of(4, 2, 4, 7, 2, 9);
		 Set<Integer> unique = new HashSet<>(withDupes);
		 System.out.println(unique); // e.g. [2, 4, 7, 9] (order not guaranteed)

	}//end of main method

}//end of class
