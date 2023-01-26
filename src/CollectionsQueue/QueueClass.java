package CollectionsQueue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class QueueClass {
	 public static void main(String args[])
	    {
	        Queue<String> pq = new PriorityQueue<>();
	 
	        pq.add("Geeks");
	        pq.add("For");
	        pq.add("Geeks");
	 
	        Iterator iterator = pq.iterator();
	 
	        while (iterator.hasNext()) {
	            System.out.print(iterator.next() + " ");
	        }
	        
	     // Creating empty priority
	        // blocking queue
	        Queue<Integer> pbq
	            = new PriorityBlockingQueue<Integer>();
	 
	        // Adding items to the pbq
	        // using add()
	        pbq.add(10);
	        pbq.add(20);
	        pbq.add(15);
	 
	        // Printing the top element of
	        // the PriorityBlockingQueue
	        System.out.println(pbq.peek());
	 
	        // Printing the top element and
	        // removing it from the
	        // PriorityBlockingQueue
	        System.out.println(pbq.poll());
	 
	        // Printing the top element again
	        System.out.println(pbq.peek());
	        
}
}
