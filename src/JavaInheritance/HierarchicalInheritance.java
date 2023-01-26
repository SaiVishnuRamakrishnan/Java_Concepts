package JavaInheritance;

class BankAA{
	void displayA(){
		System.out.println("In class BankA");
	}
}
class BankBB extends BankAA {
	void displayB() {
		System.out.println("In class BankB");
	}
}
class BankCC extends BankAA {
	void displayC() {
		System.out.println("In class BankC");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		BankCC obj = new BankCC();
		obj.displayA();
		obj.displayC();
	}

}
