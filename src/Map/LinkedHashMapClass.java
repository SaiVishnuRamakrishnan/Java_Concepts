package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapClass {
	public static void main(String args[]) {
        // Creating an empty LinkedHashMap
        Map<String, Integer> map = new LinkedHashMap<>();
 
        // Inserting pair entries in above Map
        // using put() method
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);
 
        // Iterating over Map
        for (Map.Entry<String, Integer> e : map.entrySet())
 
            // Printing ket-value pairs
            System.out.println(e.getKey() + " "
                               + e.getValue());	}
}
