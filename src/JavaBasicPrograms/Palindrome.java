package JavaBasicPrograms;

public class Palindrome {
	
	public static void main(String args[]) {
		int num =4554, temp,sum=0,r;
		
		temp=num;
		while(num>0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(sum== temp) {
			System.out.println("Palindrome..."+temp);
		}
	}
}
