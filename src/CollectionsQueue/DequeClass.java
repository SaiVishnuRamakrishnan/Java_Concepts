package CollectionsQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeClass {
	
	public static void main(String args[]) {
		
		Deque<Integer> dequeList = new ArrayDeque<Integer>(10);
		dequeList.add(1);
		dequeList.add(2);
		dequeList.add(3);
		dequeList.add(4);
		dequeList.add(5);
		
		System.out.println("The elements in the list ... ");
		for(Integer element: dequeList) {
			System.out.println(element);
		}
		
		System.out.println("Using the clear function");
		dequeList.clear();
		
		System.out.println("Using add first operation...");
		dequeList.addFirst(1);
		dequeList.addFirst(2);
		
		System.out.println("Using add last operation...");
		dequeList.addLast(3);
		dequeList.addLast(4);
		
		for(Iterator iterator = dequeList.iterator();  iterator.hasNext();) {
			System.out.println(iterator.next());
		}
		
		System.out.println("Printing elements in reverse order...");
		for(Iterator iterator = dequeList.descendingIterator();  iterator.hasNext();) {
			System.out.println(iterator.next());
		}
		System.out.println("Getting the head element..."+dequeList.getFirst());
		System.out.println("Getting the Last element..."+dequeList.getLast());
		
		Object[] arr = dequeList.toArray();
		System.out.println("Printing as array objects..");
		for(int i=0; i<arr.length;i++) 
			System.out.println(arr[i]);
		
	   System.out.println("Peek method to get head..."+dequeList.peek());
	   System.out.println("poll method to get head..."+dequeList.poll());
	   
	   System.out.println("Using push method");
	   dequeList.push(7);
	   dequeList.push(8);
	   dequeList.push(9);
	   System.out.println("After push..."+dequeList);
	   
	   System.out.println("Head element remove.."+dequeList.remove());
	   System.out.println("Final array ..."+dequeList);
	   
	   System.out.println("Adding elements in deque using offer, offerFirst, offetLast...");
	   dequeList.offer(13);
	   dequeList.offerFirst(14);
	   dequeList.offerLast(15);
	   System.out.println("After using the offer functions ..."+dequeList);

	}
}
