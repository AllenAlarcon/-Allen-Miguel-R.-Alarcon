package Allen_Project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class GradeBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// List: records in the order they were entered
		 List<String> entries = new ArrayList<>(List.of(
		 "Allen:88", "Tan:75", "Ceclia:92", "Honnelyn:95", "Jake:60", "Gilbert:82"));
		 Set<String> students = new TreeSet<>(); // unique, sorted names
		 Map<String, List<Integer>> scores = new TreeMap<>();
		 for (String entry : entries) { // enhanced for
		 String[] parts = entry.split(":");
		 String name = parts[0];
		 int mark = Integer.parseInt(parts[1]);
		 students.add(name);
		 scores.computeIfAbsent(name, k -> new ArrayList<>()).add(mark);
		 }
		 System.out.println("Students: " + students);
		 for (Map.Entry<String, List<Integer>> e : scores.entrySet()) {
		 int total = 0;
		 for (int m : e.getValue()) total += m;
		 double avg = (double) total / e.getValue().size();
		 System.out.printf("%-5s %s average = %.1f%n", e.getKey(), e.getValue(),
		avg);
		 }
		 // Remove failing students using an Iterator
		 Iterator<Map.Entry<String, List<Integer>>> it = scores.entrySet().iterator();
		 while (it.hasNext()) {
		 List<Integer> list = it.next().getValue();
		 if (Collections.max(list) < 70) it.remove();
		 }
		 System.out.println("After removal: " + scores.keySet());

	}

}
