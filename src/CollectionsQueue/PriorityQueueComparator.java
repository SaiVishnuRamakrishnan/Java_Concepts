package CollectionsQueue;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueComparator {
	
	public static void main(String args[]) {
		
        // Creating Priority queue constructor having 
        // initial capacity=5 and a StudentComparator instance 
        // as its parameters
		PriorityQueue<Student> obj = new PriorityQueue<Student>(5, new StudentComparator());
		
		Student student1 = new Student("A", 1.0);
		obj.add(student1);
		
		Student student2 = new Student("C", 10.0);
		obj.add(student2);
		
		Student student3 = new Student("D", 5.0);
		obj.add(student3);
		
		Student student4 = new Student("B", 2.0);
		obj.add(student4);
		
		Iterator<Student> itrIterator = obj.iterator();
		while(itrIterator.hasNext()) {
			System.out.println(obj.poll().getName());
		}
		
	}
}

class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.cgpa < o2.cgpa) return 1;
		else return -1;
	}
	
}

class Student {
	
	public String name;
	public double cgpa;

	public Student(String name, double d) {
		this.name = name;
		this.cgpa = d;
	}
	
	public String getName() {
		return this.name;
	}
	
}
