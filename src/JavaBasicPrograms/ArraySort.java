package JavaBasicPrograms;
import java.util.Arrays;
	import java.util.Collections;   

public class ArraySort {
	public static void main(String args[]) {
		int arr[] = {1, 2,  5, 6, 3, 4};
		Integer arr2[] = {1, 2,  5, 6, 3, 4};

		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		Arrays.sort(arr2, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr2));
		//Arrays.sort(a, 2, 7);    -- to sort array sub array    

	}
}
