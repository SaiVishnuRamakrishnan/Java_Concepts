package JavaPolymorphism;

class Adder{
	static int add(int a, int b) {
		return a+b;
	}
	
	static int add(int a, int b, int c) {
		return a+b+c;
	}
	
	//changing return type
	static int sub(int a, int b) {
		return a-b;
	}
	static double sub(double a, double b) {
		return  a-b;
	}
 }

public class MethodOverloading {
	public static void main(String args[]) {
		Adder obj = new Adder();
		System.out.println(obj.add(5, 10));
		System.out.println(obj.add(5, 5, 5));
		System.out.println(obj.sub(5, 5));
		System.out.println(obj.sub(12.0, 13.1));
	}
}
