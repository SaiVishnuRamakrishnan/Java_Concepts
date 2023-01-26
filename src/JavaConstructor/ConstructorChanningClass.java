package JavaConstructor;

public class ConstructorChanningClass {
    // block to be executed before any constructor.
    {
        System.out.println("init block");
    }
	
	public ConstructorChanningClass() {
		//calling second constructor
		this(5);
		System.out.println("Default Constructor");
	}
	
	public ConstructorChanningClass(int i) {
		//calling third constructor
		this(5,10);
		System.out.println("In second constructor.."+i);
	}

	public ConstructorChanningClass(int i, int j) {
		System.out.println("In second constructor.."+i+"....."+j);
	}

	public static void main(String args[]) {
		new ConstructorChanningClass();
		new ConstructorChanningClass(5, 10);
	}
}
