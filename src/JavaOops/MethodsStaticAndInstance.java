package JavaOops;

public class MethodsStaticAndInstance {

	public static void main(String[] args) {
		print();
		MethodsStaticAndInstance objAndInstance = new MethodsStaticAndInstance();
		System.out.println(objAndInstance.add(5, 8));
	}
	//static method  
	//a method that belongs to a class rather than an instance of a class is known as a static method
	static void print() {
		System.out.println("In Static method");
	}
	
	//instance method
	public int add(int a, int b) {
		return a+b;
	}
}
