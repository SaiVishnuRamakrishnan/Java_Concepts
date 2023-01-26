package JavaOops;

abstract class Demo{
	void printMessage() {
	}
}
public class AbstractMethod extends Demo{
	void printMessage() {
		System.out.println("Abstract method");
	}
	public static void main(String[] args) {
		Demo obj = new AbstractMethod();
		obj.printMessage();
	}

}
