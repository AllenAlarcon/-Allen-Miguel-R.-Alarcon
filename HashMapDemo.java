package Allen_Project;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> marks = new HashMap<>();
		 marks.put("Allen", 88);
		 marks.put("Tan", 75);
		 marks.put("Angel", 92);
		 marks.put("Lea", 80); // replaces the old value 75
		 System.out.println(marks.get("Lea")); // 80
		 System.out.println(marks.get("Gilbert")); // null
		 System.out.println(marks.getOrDefault("Gilbert", 0)); // 0
		 System.out.println(marks.containsKey("Honnelyn")); // true
		 System.out.println(marks.size()); // 3
		 marks.remove("Chen");
		 System.out.println(marks); // {Honnelyn=88, Lea=80} (order may vary)
		 
		 String text = "to be or not to be";
		 Map<String, Integer> freq = new HashMap<>();
		 for (String word : text.split(" ")) {
		  freq.put(word, freq.getOrDefault(word, 0) + 1);
		 }
		 // A more compact form using merge():
		 
		// freq.merge(word, 1, Integer::sum);
		 System.out.println(freq); // {be=2, not=1, or=1, to=2} (order may vary)

	}//end of main method

}//end of class
