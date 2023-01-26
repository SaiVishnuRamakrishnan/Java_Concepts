package JavaOops;

class ClassAndObjectThroughConstructor {
	int id;
	String nameString;
	
	ClassAndObjectThroughConstructor(int id, String name) {
		this.id = id;
		this.nameString = name; 
	}
	
	void print() {
		System.out.println("The details are..."+"Id = "+this.id+"..Name = "+this.nameString);
	}
	
	public static void main(String args[]) {
		ClassAndObjectThroughConstructor obj = 	new ClassAndObjectThroughConstructor(1, "Sai");
		obj.print();
	}
}
