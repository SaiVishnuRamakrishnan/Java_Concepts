package JavaAbstraction;

abstract class controlCar{
	String colorString;
	
	abstract void speed();
	abstract void applyBreak();
	
	public controlCar(String carColor) {
		System.out.println("Abstract method constructor called");
		this.colorString = carColor;
	}
	
	public String getColor() {
		return colorString;
	}
}

class ModelOne extends controlCar {
	int speed;
	boolean breakApply;
	
	public ModelOne(String carColor, int speed, boolean breakApplied) {
		super(carColor);
		this.speed = speed;
		this.breakApply = breakApplied;
		System.out.println("In ModelOne car class constructor"+"..color"+super.getColor());
		speed();
		applyBreak();
	}

	@Override
	void speed() {
		System.out.println("Current Speed in model one ..." +speed);
	}

	@Override
	void applyBreak() {
		System.out.println("Break applied in model one..." + breakApply);
	}
}

class ModelTwo extends controlCar {
	boolean breakApply;

	public ModelTwo(String carColor, boolean breakApplied) {
		super(carColor);
		breakApply = breakApplied;
		System.out.println("In ModelTwo car class constructor"+"..color"+super.getColor());
		speed();
		applyBreak();
	}

	@Override
	void speed() {
		System.out.println("Current Speed in model Two ..." );
	}

	@Override
	void applyBreak() {
		System.out.println("Break applied in model one..." + breakApply);
	}
	
}
public class AbstracrClassExample {
	public static void main(String args[]) {
		ModelOne ob1 = new ModelOne("Black", 10, false);
		ModelTwo ob2 = new ModelTwo("Green", false);
	}
}
