package Arrays;

import java.awt.print.Printable;

public class ArrayReverseHalfLoop {
	
	public static void main(String args[]) {
		int array[] = {10, 20, 30, 40, 50, 60};
		reverseArrayUsingSwpaping(array, array.length);
		reverseWithoutSwaping(array, array.length);
		sorting(array, array.length);
	}
	
	private static void reverseWithoutSwaping(int[] array, int length) {
		int bArray[] = new int[length];
		int tempLength = length;
		for(int i=0; i<length; i++) {
			bArray[tempLength-1] = array[i];
			tempLength--;
		}
		System.out.println("Reverse order without swaping...");
		printArray(bArray);
	}

	private static void sorting(int[] array, int length) {
		int temp;
		for(int i=0;i<length; i++) {
			for(int j=i+1; j<length; j++) {
				if(array[j] < array[i]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("Sorted order...");
		printArray(array);
	}


	static void reverseArrayUsingSwpaping(int array[], int arrayLength) {
			int temp;
			for(int i=0;i<arrayLength/2;i++) {
				temp = array[i];
				array[i] = array[arrayLength-i-1];
				array[arrayLength-i-1] = temp;
			}
			System.out.println("Reverse order using swaping....");
			printArray(array);
	}
	
	private static void printArray(int[] array) {
		for (int loop : array) {
			System.out.println(loop);
		}		
	}
 }
