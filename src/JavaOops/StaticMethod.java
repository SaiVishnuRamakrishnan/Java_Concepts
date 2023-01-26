package JavaOops;

class StudentDetails {
	int rollno;
	String nameString="";
	static String nameStringStaticString ="Before";
	
	static void change() {
		nameStringStaticString = "After";
	}
	
	public StudentDetails(int r, String n) {
		this.rollno = r;
		this.nameString = n;
	}
	
	void display() {
		System.out.println("Rollno and Name...."+this.rollno+ this.nameString+StudentDetails.nameStringStaticString);
	}
}

public class StaticMethod {
	public static void main(String args[]) {
		StudentDetails obj = new StudentDetails(0, "Sai");
		obj.display();
		StudentDetails.change();
		obj.display();
	}
}

/**
The static method can not use non static data member or call non-static method directly.
this and super cannot be used in static context
Output:Compile Time Error

class A{  
	 int a=40;//non static  
	   
	 public static void main(String args[]){  
	  System.out.println(a);  
	 }  
	}
*/