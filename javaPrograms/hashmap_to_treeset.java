package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/* Java Program to convert HashMap to TreeMap in Java 8 */

public class hashmap_to_treeset {	

		// Generic function to construct a new 
		// TreeMap from HashMap 
		public static <K, V> Map<K, V> convertToTreeMap(Map<K, V> hashMap) 
		{ 
			Map<K, V> 
				treeMap = hashMap 
							// Get the entries from the hashMap 
							.entrySet() 

							// Convert the map into stream 
							.stream() 

							// Now collect the returned TreeMap 
							.collect( 
								Collectors 

									// Using Collectors, collect the entries 
									// and convert it into TreeMap 
									.toMap( 
										Map.Entry::getKey, 
										Map.Entry::getValue, 
										(oldValue,newValue) -> newValue, 
										TreeMap::new)); 

			// Return the TreeMap 
			return treeMap; 
		} 

		public static void main(String args[]) 
		{ 
			// Create a HashMap 
			Map<String, String> hashMap = new HashMap<>(); 

			// Add entries to the HashMap 
			hashMap.put("1", "Geeks"); 
			hashMap.put("2", "forGeeks"); 
			hashMap.put("3", "A computer Portal"); 

			// Print the HashMap 
			System.out.println("HashMap: " + hashMap); 

			// construct a new TreeMap from HashMap 
			Map<String, String> treeMap = convertToTreeMap(hashMap); 

			// Print the TreeMap 
			System.out.println("TreeMap: " + treeMap); 
		} 
	

}
