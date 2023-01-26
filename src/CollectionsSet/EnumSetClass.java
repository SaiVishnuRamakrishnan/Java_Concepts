package CollectionsSet;

import java.util.EnumSet;
import java.util.Set;

enum Enumset {
	CODE,LEARN, CONTRIBUTE, QUIZ, MCQ;
}	
public class EnumSetClass {
	public static void main(String args[]) {
		Set<Enumset> enumsetClass;
		
		 // Adding the elements
		enumsetClass = EnumSet.of(Enumset.CODE, Enumset.QUIZ);
		System.out.println("Set ..."+enumsetClass);
	}
}
