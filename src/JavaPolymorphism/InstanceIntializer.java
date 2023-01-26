package JavaPolymorphism;

public class InstanceIntializer {
	int speed;
	public InstanceIntializer() {
		System.out.println("Speed ...."+speed);
	}
	{speed = 500;}
	
	public static void main(String args[]) {
		InstanceIntializer obj = new InstanceIntializer();
	}
}
