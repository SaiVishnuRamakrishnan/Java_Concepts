package CollectionsList;

import java.util.Iterator;
import java.util.Vector;

public class VectorClass {
	
	public static void main(String args[]) {
		
	Vector<String> listObj = new Vector<String>();
	
	listObj.add("A");
	listObj.add("B");
	listObj.add("C");
	
	Iterator<String> itrIterator = listObj.iterator();
	while(itrIterator.hasNext()) {
		System.out.println(itrIterator.next());
	}
	System.out.println("Creating a default vector...");
	Vector v2 = new Vector();
	v2.add(1);
	v2.add(2);
	v2.add("Three");
	v2.add("Four");
	System.out.println("New vector ..."+v2);
	
	System.out.println("Updating the elements..."+v2.set(2, "ThreeUpdated"));
	for(int i=0;i<v2.size();i++) {
		System.out.println(v2.get(i));
	}
	}
}
