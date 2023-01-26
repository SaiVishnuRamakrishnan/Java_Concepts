package JavaBasicPrograms;
import java.util.Scanner;

public class FibonnaciSeries {
	
	public static void main(String args[]) {
		int temp1=0,temp2=1, temp3, n;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		System.out.println(temp1+"\n"+temp2);
		for (int i=2;i<n;i++) { //loop starts from 2 since 0 and 1 is already printed.
			temp3 = temp1+temp2;
			System.out.println(temp3);
			temp1= temp2;
			temp2= temp3;
		}
	}
}
