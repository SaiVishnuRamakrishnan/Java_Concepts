package JavaInheritance;

class BankA {
	void displayA() {
		System.out.println("In Bank A");
	}
}
class BankB extends BankA{
	void displayB() {
		System.out.println("In Bank B");
	}
}
public class SingleInheritance {
	public static void main(String args[]) {
		BankB obj = new BankB();
		obj.displayA();
		obj.displayB();
	}
}
