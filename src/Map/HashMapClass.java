package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
	@SuppressWarnings("deprecation")
	public static void main(String args[]) {
		Map<Integer, String> mapList = new HashMap<>();
		mapList.put(1, "A");
		mapList.put(3, "C");
		mapList.put(2, "B");

		
		for(Map.Entry<Integer, String> me :
			mapList.entrySet()) {
			System.out.print(me.getKey()+":");
			System.out.println(me.getValue());
		}
		
        Map<Integer, String> hm1 = new HashMap<>();
        
        // Initialization of a Map
        // using Generics
        Map<Integer, String> hm2
            = new HashMap<Integer, String>();
 
        // Inserting the Elements
        hm1.put(1, "Geeks");
        hm1.put(2, "For");
        hm1.put(3, "Geeks");
 
        hm2.put(new Integer(1), "Geeks");
        hm2.put(new Integer(2), "For");
        hm2.put(new Integer(3), "Geeks");
 
        System.out.println(hm1);
        System.out.println(hm2);
        
        Map<Integer, String> hm1u
        = new HashMap<Integer, String>();

    // Inserting the Elements
    hm1u.put(new Integer(1), "Geeks");
    hm1u.put(new Integer(2), "Geeks");
    hm1u.put(new Integer(3), "Geeks");
    hm1u.put(new Integer(4), "For");
    
    System.out.println(hm1);
    
    hm1.remove(new Integer(4));

    // Final Map
    System.out.println(hm1);


    System.out.println("Initial Map " + hm1u);

    hm1u.put(new Integer(2), "For");

    System.out.println("Updated Map " + hm1u);
        
//With intial capacity
    //HashMap<Integer, String> hm1 = new HashMap<>(10);
    
    //with load factor
    //        HashMap<Integer, String> hm1 = new HashMap<>(5, 0.75f);
    // Initialization of a HashMap
    // using Generics
//    HashMap<Integer, String> hm2= new HashMap<Integer, String>(hm1);
    
    
    /*
     * 1. Initial Capacity – It is the capacity of HashMap at the time of its creation (It is the number of buckets a HashMap can hold when the HashMap is instantiated). In java, it is 2^4=16 initially, meaning it can hold 16 key-value pairs.

2. Load Factor – It is the percent value of the capacity after which the capacity of Hashmap is to be increased (It is the percentage fill of buckets after which Rehashing takes place). In java, it is 0.75f by default, meaning the rehashing takes place after filling 75% of the capacity.

3. Threshold – It is the product of Load Factor and Initial Capacity. In java, by default, it is (16 * 0.75 = 12). That is, Rehashing takes place after inserting 12 key-value pairs into the HashMap.

4. Rehashing – It is the process of doubling the capacity of the HashMap after it reaches its Threshold. In java, HashMap continues to rehash(by default) in the following sequence – 2^4, 2^5, 2^6, 2^7, …. so on. 
     * 
     */

	}
}
