package JavaPolymorphism;

class ParentA{
	void run() {
		System.out.println("In the parent class");
	}
}
public class MethodOverriding extends ParentA{
	//defining the same method as in the parent class  
	void run() {
		System.out.println("In the child class");
	}
	public static void main(String args[]) {
		MethodOverriding obj = new MethodOverriding();
		obj.run();
	}
}
