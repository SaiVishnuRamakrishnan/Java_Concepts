package JavaInheritance;

class Bonus{
	float bonus = 4000;
}

public class SimpleInheritance extends Bonus{
	int salary = 5000;
	public static void main(String[] args) {
		SimpleInheritance  obj = new SimpleInheritance();
		// object can access the field of own class as well as of Employee class i.e. code reusability.
		System.out.println(obj.salary);
		System.out.println(obj.bonus);
		
	}

}
