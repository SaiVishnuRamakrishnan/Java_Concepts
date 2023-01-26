package JavaBasicPrograms;

public class Armstrong {
	
	public static void main(String args[]) {
		int number = 1634,temp,sum = 0,count=0,last;
		
		temp=number;
		while(number>0) {
			count++;
			number = number/10;
		}
		number = temp;
		while(number >0) {
			last = number%10;
			sum += Math.pow(last, count);
			number = number/10;
		}
		if(sum == temp) {
			System.out.println("Amstrong..."+temp);
		}
	}
}
