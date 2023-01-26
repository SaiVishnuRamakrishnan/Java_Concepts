package CollectionsList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {
	
	public static void main(String args[]) {
		
		ArrayList<String> arrayobj = new ArrayList<String>();
		arrayobj.add("First");
		arrayobj.add(1, "Second");
		arrayobj.add("Third");
		
		Iterator<String> itrIterator = arrayobj.iterator();
		while(itrIterator.hasNext()) {
			System.out.println(itrIterator.next());
		}
		System.out.println("Changing elemts...");
		arrayobj.set(1,"SecondChanged");
		System.out.println("After changing..."+arrayobj);
		
		System.out.println("Removing element..."+arrayobj.remove(1));
	}
}
