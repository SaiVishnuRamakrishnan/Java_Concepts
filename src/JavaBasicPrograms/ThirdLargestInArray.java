package JavaBasicPrograms;
public class ThirdLargestInArray {
	public static void main(String args[]) {
		
		int arr[] = {1, 2, 6, 5, 3, 4};
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i] >arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println(arr[arr.length-3]);
	}
}
