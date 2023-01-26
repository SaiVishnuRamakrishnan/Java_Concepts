package JavaBasicPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		int n=100;
		boolean isPrime = true;
		String primeNumberString = "";
		
		for(int i=2;i<=n;i++) {
			isPrime = prime(i);
			if(isPrime) {
				primeNumberString = primeNumberString+i+" ";
			}
		}
		System.out.println(primeNumberString);
	}

	private static boolean prime(int n) {
		int remainder;
		for(int i=2;i<=n/2;i++) {
			remainder = n%i;
			if(remainder==0) {
				return false;
			}
		}
		return true;
	}

}
