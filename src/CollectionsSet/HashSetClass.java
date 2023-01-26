package CollectionsSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetClass {
	
	public static void main(String args[]) {
		Set<String> hashSet = new HashSet<String>();
		System.out.println("Sorted Set");
		hashSet.add("A");
		hashSet.add("C");
		hashSet.add("B");
		
		String checkString = "C";
		System.out.println("Hash to check .... contains or not   - "+checkString+"........"+hashSet.contains(checkString));
		
		for(Iterator iterator = hashSet.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}
		
		System.out.println("Intersection....Union...Differnce using Sets in HashMap");
		
		// Creating an object of Set class
        // Declaring object of Integer type
		Set<Integer> aIntegers = new HashSet<Integer>();
		// Adding all elements to List
		aIntegers.addAll(Arrays.asList(new Integer[] { 1, 3, 2, 4, 8, 9, 0}));
		
		Set<Integer> bIntegers = new HashSet<Integer>();
		bIntegers.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 4, 0, 7, 5 }));
		
		System.out.println("Union....");
		Set<Integer> unionIntegers = new HashSet<>(aIntegers);
		System.out.println("Before union..."+unionIntegers);
		unionIntegers.addAll(bIntegers);
		System.out.println("After union..."+unionIntegers);
		
		System.out.println("Intersection...");
		Set<Integer> interIntegers = new HashSet<>(aIntegers);
		System.out.println("Before Intersection..."+interIntegers);
		interIntegers.retainAll(bIntegers);
		System.out.println("After Intersection..."+interIntegers);
		
		System.out.println("Difference...");
		Set<Integer> diffIntegers = new HashSet<>(aIntegers);
		System.out.println("Before Difference..."+diffIntegers);
		diffIntegers.removeAll(bIntegers);
		System.out.println("After Difference..."+diffIntegers);

		
	}
}
