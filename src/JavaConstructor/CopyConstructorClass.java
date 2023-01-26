package JavaConstructor;

public class CopyConstructorClass {
	double number, imagNumber;
	
	public CopyConstructorClass(double i, double j) {
		this.number = i;
		this.imagNumber = j;
	}
	
	CopyConstructorClass(CopyConstructorClass obj) {
		this.number = obj.number;
		this.imagNumber = obj.imagNumber;
	}
	
    @Override
    public String toString() {
        return "(" + number + " + " + imagNumber + "i)";
    }

	public static void main(String args[]) {
		CopyConstructorClass class1 = new CopyConstructorClass(10, 15);
		CopyConstructorClass class2 = new CopyConstructorClass(class1);
		CopyConstructorClass class3 = class2;
		System.out.println(class2);
		System.out.println(class3);
		;
		
	}

}
