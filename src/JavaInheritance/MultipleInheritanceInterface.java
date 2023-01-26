package JavaInheritance;

interface B1{
	default void display() {
		System.out.println("In B1");
	}
}
interface B2{
	default void display() {
		System.out.println("In B2");
	}
}
class MultipleInheritanceInterface implements B1, B2{
  
	// Overriding default show method
	public void display() {
        // Using super keyword to call the show
        // method of PI1 interface
		B1.super.display();
		B2.super.display();
	}
	
	public static void main(String args[]) {
		MultipleInheritanceInterface obj = new MultipleInheritanceInterface();
		obj.display();
	}
}
