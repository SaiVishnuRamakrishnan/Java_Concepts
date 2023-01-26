package CollectionsList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListClass {
	
	public static void main(String args[]) {
		
		LinkedList<String> linkedObj = new LinkedList<String>();
		linkedObj.add("1");
		linkedObj.add("2");
		linkedObj.add("2");
		linkedObj.add("3");

		
		Iterator<String> itrIterator = linkedObj.iterator();
		
		while(itrIterator.hasNext()) {
			System.out.println(itrIterator.next());
		}
		linkedObj.remove("2");
		System.out.println("After removing ..."+linkedObj);
		
		linkedObj.set(1, "1.2");
		System.out.println("After Setting ..."+linkedObj);


	}
}
