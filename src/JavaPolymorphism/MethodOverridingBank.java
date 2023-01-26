package JavaPolymorphism;

class Bank{
	float getInterset() {
		return 0;
	}
}
class SBI extends Bank{
	float getInterest() {
		return 5;
	}
}
class ICICI extends Bank{
	float getInterest() {
		return 10;
	}
}
class AXICS extends Bank{
	float getInterest() {
		return 12;
	}
}

public class MethodOverridingBank {

	public static void main(String[] args) {
		SBI sbi = new SBI();
		ICICI iiIcici = new ICICI();
		AXICS axics = new AXICS();
		System.out.println(sbi.getInterest());
		System.out.println(iiIcici.getInterest());
		System.out.println(axics.getInterest());
	}

}
