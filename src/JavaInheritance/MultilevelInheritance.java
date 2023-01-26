package JavaInheritance;
class BankTypeA{
	void displayA() {
		System.out.println("In Bank A");
	}
}
class BankTypeB extends BankTypeA{
	void displayB() {
		System.out.println("In Bank B");
	}
}
class BankTypeC extends BankTypeB {
	void displayC() {
		System.out.println("In Bank C");
	}
}
public class MultilevelInheritance {
	public static void main(String args[]) {
		BankTypeC obj = new BankTypeC();
		obj.displayA();
		obj.displayB();
		obj.displayC();
	}
}
