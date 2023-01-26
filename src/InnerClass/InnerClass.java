package InnerClass;

class OuterClass {
	int a = 10;
	
	class IneerInnerClass {
		int b = 100;
	}
}

public class InnerClass {
	public static void main(String args[]) {
		OuterClass obj = new OuterClass();
		OuterClass.IneerInnerClass myInnerClass = obj.new IneerInnerClass();
		System.out.println(obj.a+myInnerClass.b);
	}
}
