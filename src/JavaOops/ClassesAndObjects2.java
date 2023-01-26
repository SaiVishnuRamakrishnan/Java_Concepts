package JavaOops;

class TestClassesAndObjects2 {
	int studentId;
	String studentNameString;
}
class ClassesAndObjects2{
	
	public static void main(String args[]) {
		TestClassesAndObjects2 objects = new TestClassesAndObjects2();
		objects.studentId=1;
		objects.studentNameString="Sai";
		System.out.println(objects.studentId);
		System.out.println(objects.studentNameString);
		TestClassesAndObjects2 objects2 = new TestClassesAndObjects2();
		objects2.studentId=1;
		objects2.studentNameString="Sai";
		System.out.println(objects2.studentId);
		System.out.println(objects2.studentNameString);
	}
}