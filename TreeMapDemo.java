package Allen_Project;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer, String> rank = new TreeMap<>();
		 rank.put(3, "Bronze");
		 rank.put(1, "Gold");
		 rank.put(2, "Silver");
		 System.out.println(rank); // {1=Gold, 2=Silver, 3=Bronze}
		 System.out.println(rank.firstKey()); // 1
		 System.out.println(rank.lastEntry()); // 3=Bronze
		 System.out.println(rank.floorKey(2)); // 2 (greatest key <= 2)
		 System.out.println(rank.ceilingKey(2));// 2 (smallest key >= 2)
		 System.out.println(rank.headMap(3)); // {1=Gold, 2=Silver}

	}

}
