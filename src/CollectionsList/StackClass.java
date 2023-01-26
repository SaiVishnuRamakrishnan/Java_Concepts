package CollectionsList;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Stack;

public class StackClass {
	
	public static void main(String args[]) {
		Stack<String> stackList = new Stack<String>();
		
		stackList.push("A");
		stackList.push("B");
		stackList.push("C");
		System.out.println("Before pop " + stackList.peek());
		stackList.pop();
		System.out.println("After pop " + stackList.peek());
		Iterator<String> iterator = stackList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("Stack Search..");
		stack_search(stackList, "B");
		stack_search(stackList, "D");
		
		// A Java Program to show implementation
		// of Stack using ArrayDeque
		// It is recommended to use ArrayDeque for stack implementation 
		//as it is more efficient in a single-threaded environment.
		Deque<String> dequeStack = new ArrayDeque<String>();
		dequeStack.push("A");
		dequeStack.push("B");
		dequeStack.pop();
		dequeStack.remove("A");
	}

	private static void stack_search(Stack<String> stackList, String string) {
		int posInteger = stackList.search(string);
		//Integer posInteger = stackList.search(string); // Integer posInteger = (Integer) stackList.search(string);
		if(posInteger == -1) {
			System.out.println("Element not found in the stack");
		} else {
			System.out.println("Element found in the position ..."+posInteger);
		}
	}
}
