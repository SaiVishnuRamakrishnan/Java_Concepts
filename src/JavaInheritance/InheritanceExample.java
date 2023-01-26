package JavaInheritance;

class MainClass {
	public int gear;
	public int speed;
	
	public MainClass(int gear2, int speed2) {
		gear = gear2;
		speed = speed2;
	}

	public void applyBreak(int decrement) {
		speed = speed - decrement;
	}
	
	public void speedUp(int increment) {
		speed = speed + increment;
	}	
	
	public String toString() {
		return "Number of gears..."+gear+"....."+"Speed....."+speed;
	}
	
}

class DerivedClass extends MainClass{
	int heighth;
	
	public DerivedClass(int gear, int speed, int height) {
		super(gear, speed);
		heighth = height;
	}
	public void changeHeight(int newSeatHeight) {
		heighth = newSeatHeight;
	}
	
	public String toString() {
		return super.toString()+"height...."+heighth;
	}
}
public class InheritanceExample {
	public static void main(String args[]) {
		DerivedClass derivedClass = new DerivedClass(10, 20, 30);
		System.out.println(derivedClass.toString());
	}
}
