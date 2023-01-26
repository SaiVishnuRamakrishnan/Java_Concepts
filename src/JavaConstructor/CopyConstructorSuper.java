package JavaConstructor;

class Base {
	
	Base() {
		this("");
		System.out.println("In base class constructor class");
	}

	public Base(String string) {
		System.out.println("In base class constructor with paramenter...."+string);
	}
}

public class CopyConstructorSuper extends Base {
	CopyConstructorSuper() {
		this("");
		System.out.println("In derived constructor class");
	}
	public CopyConstructorSuper(String string) {
		//super(); 4 will be executed
		super(string);
		System.out.println("In derived class constructor with parameter...."+string);
	}
	public static void main(String args[]) {
		new CopyConstructorSuper("test");
	}
}