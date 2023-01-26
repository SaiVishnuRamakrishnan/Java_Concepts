package JavaOops;

class OddOrEven{
	 void calcOddOrEven(int num) {
		 if(num%2==0) System.out.println("Even");
		 else {
			 System.out.println("Odd");
		 }
	 }
}

public class MethodsPredefinedAndUserdefined {
	
	public static void main(String args[]) {
		//predefined
		System.out.println("Max of two numbers..."+Math.max(10, 0));
		//userdefined
		OddOrEven obj = new OddOrEven();
		obj.calcOddOrEven(3);
	}
	
}
