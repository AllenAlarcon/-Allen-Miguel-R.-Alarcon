package Allen_Project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayVSLinked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> nums = new ArrayList<>(List.of(5, 3, 6, 7));
		Collections.sort(nums); // [7, 3, 5, 6]
		Collections.reverse(nums); // [6, 5, 3, 7]
		
		System.out.println(Collections.max(nums)); 
		System.out.println(Collections.min(nums));
		
		nums.sort(null); // natural-order sort, Java 8+


	}

}
