package JavaInheritance;

class Operation{
	int square(int a) {
		return a*a;
	}
}
public class Aggregation {
	Operation operation; //aggregation
	double pi = 3.14;
	
	double area (int radius) {
		operation = new Operation();
		int square = operation.square(radius); //code reusability (i.e. delegates the method call).  
		return pi*square;
	}
	
	public static void main(String args[]) {
		Aggregation obj = new Aggregation();
		double result = obj.area(5);
		System.out.println(result);
	}
}
