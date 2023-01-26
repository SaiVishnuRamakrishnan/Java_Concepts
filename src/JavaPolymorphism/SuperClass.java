package JavaPolymorphism;

class ParentClass{
	ParentClass() {
		System.out.println("In parent class constructor using super");
	}
	String color = "White";
}
public class SuperClass extends ParentClass{
	
	SuperClass(){
		super();//should be the first statement in the constructor class
	}

	String color = "Black";
	void print() {
		System.out.println(color);
		System.out.println(super.color);
	}
	public static void main(String args[]) {
		SuperClass obj = new SuperClass();
		obj.print();
	}
}
