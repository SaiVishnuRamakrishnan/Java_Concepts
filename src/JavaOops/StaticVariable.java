package JavaOops;

public class StaticVariable {
 int count =0; //will get memory each time when the instance is created  
 static int countStatic = 0; //will get memory only once and retain its value  
 
 	public StaticVariable() {
 		count++;
 		countStatic++;
 		System.out.println("Non static count ---"+count);
 		System.out.println("Static Count ---"+countStatic);
 	}
 	
 	public static void main(String args[]) {
 		System.out.println("Without static varialble");
 		StaticVariable obj = new StaticVariable();
 		StaticVariable obj1 = new StaticVariable();
 		StaticVariable obj2 = new StaticVariable();

 	}
}
