package CollectionsQueue;

import java.awt.print.Printable;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Spliterator;

public class PriorityQueueOperations {
	public static void main(String args[]) {
		
		PriorityQueue<String> obj = new PriorityQueue<>();
		
		//adding elements
		obj.add("A");
		obj.add("B");
		obj.add("C");
		
		System.out.println("Before removing = "+obj);
		
		//removing particular element from queue
		obj.remove("B");
		
		System.out.println("After removing = "+obj);
		
		//removing using poll
		obj.poll();
		System.out.println("After removing using poll = "+obj);
		
		//contains
		System.out.println("Contains - C " +obj.contains("C"));

		//after clearing queue
		obj.clear();
		System.out.println("After clearing = "+obj);
		
		//adding elements
		obj.add("A");
		obj.add("B");
		obj.add("C");
		
		//spliterator
		//Spliterator is better way to traverse over element because it provides more control on elements.
		Spliterator<String> spliterator = obj.spliterator();
		System.out.println("List of string objects...");
		spliterator.forEachRemaining((n) -> System.out.println(n));
		//using print method
		Spliterator<String> spliteratorPrint = obj.spliterator();
		System.out.println("Using print method in spliterator...");
		spliteratorPrint.forEachRemaining((n) -> print(n));
		
		///toArray
		System.out.println("To array ...");
		Object[] arr = obj.toArray();
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		//or
		System.out.println("To array ...");
		String[] arrS = new String[3];
		String[] arrP = obj.toArray(arrS);
		for(int i=0; i<arrP.length; i++) {
			System.out.println(arrP[i]);
		}

		
	}

	public static void print(String n) {
		System.out.println("Values.."+n);
	}
}
