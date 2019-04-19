package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
 
public class SortingHashMapInAscendingOrder {
 
    public static void main(String[] args) {
 
        // creating HashMap object of type <String, String>
        HashMap<String, String> hm = new HashMap<String, String>(); 
 
        // adding key-value pairs to HashMap object
        hm.put("Microsoft", "Bill Gates");
        hm.put("Apple", "Steve Jobs");
        hm.put("Google", "Sundar Pichai");
        hm.put("LinkedIn", "Reid Hoffman");
        hm.put("Facebook", "Mark Zuckerberg");
 
        // Random Order iterating
        System.out.println("Before Sorting : Random Order \n");
 
        // getting keySet() into Set
        Set<String> set = hm.keySet();
 
        // get Iterator from key set
        Iterator<String> itr = set.iterator();
 
        // iterating in random order
        while(itr.hasNext()) {
            String key = itr.next();
            System.out.println("Key : "  + key + "\t\t"
                    + "Value : "  + hm.get(key));
        }
 
 
        // After Sorting : Ascending order
        System.out.println("\n\n\nAfter Sorting : Ascending order\n");
 
        // convert to TreeMap
        Map<String, String> ts = new TreeMap<String, String>(hm);
 
        // iterate acc to ascending order of keys
        for(String strKey : ts.keySet()){
            System.out.println("Key : "  + strKey + "\t\t"
                    + "Value : "  + hm.get(strKey));
        }
    }
}
