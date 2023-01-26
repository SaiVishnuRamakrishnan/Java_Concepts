package CollectionsSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetClass {
	public static void main(String args[]) {
		Set<String> linkedHashSet= new LinkedHashSet<String>();
		
		linkedHashSet.add("A");
		linkedHashSet.add("B");
		linkedHashSet.add("C");
		//adding duplicate
		linkedHashSet.add("B");
		System.out.println("Before removing..."+linkedHashSet);
		linkedHashSet.remove("C");
		System.out.println("After removing..."+linkedHashSet);
	}
}
