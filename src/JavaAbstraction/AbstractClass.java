package JavaAbstraction;

interface  Sample{
	void a();
	void b();
	void c();
}

abstract class B implements Sample {
	public void c() {
		System.out.println("C");
	}
}

class M extends B{  
public void a(){System.out.println("I am a");}  
public void b(){System.out.println("I am b");}  
}  

public class AbstractClass {

	public static void main(String[] args) {
		Sample a = new M(); //upcasting
		a.a();  
		a.b();  
		a.c();  
		
	}

}
