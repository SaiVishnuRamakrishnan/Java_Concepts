package CollectionsSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetClass {
	public static void main (String args[]) {
		Set<String> treeSet = new TreeSet<String>();
		//		SortedSet<String> treeSet = new TreeSet<String>();

		treeSet.add("B");
		treeSet.add("C");
		treeSet.add("A");
		System.out.println("The tree set elements are ... "+ treeSet);
		
	}
}
