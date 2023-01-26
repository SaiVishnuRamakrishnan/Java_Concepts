package CollectionsQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueClass {
	
	public static void main(String args[]) {
		
		PriorityQueue<String> listObj = new PriorityQueue<String>();
		
		listObj.add("A");
		listObj.add("B");
		listObj.add("C");
		listObj.add("D");
		
		System.out.println("Head element - " +listObj.peek());
		listObj.poll();
		System.out.println("After removing head element - head - " +listObj.peek());
		
		Iterator<String> itrIterator = listObj.iterator();
		//ordering natural ordering
		while(itrIterator.hasNext()) {
			System.out.println("Queue elements - "+ itrIterator.next());
		}
			}
}
