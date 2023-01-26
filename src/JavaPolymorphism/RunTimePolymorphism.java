package JavaPolymorphism;

class Main {
	int dummy = 50;
	void display() {
		System.out.println("In main");
	}
}
public class RunTimePolymorphism extends Main{
	int dummy = 100;
	void display() {
		System.out.println("In Child");
	}
	public static void main(String[] args) {
		Main obj = new RunTimePolymorphism();
		obj.display();//upcasting
		System.out.println(obj.dummy);//upcasting cannot be achieved in data members
	}

}
