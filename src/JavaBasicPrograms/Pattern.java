package JavaBasicPrograms;

public class Pattern {
	public static void main(String args[]) {
		int n=8;
		
		//left triangle
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
		//right triangle
		for(int i=0;i<n;i++) {
			for(int j=2*(n-i); j>=0; j--) {
				//prints space between two stars  
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		//right triangle without space
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				//prints space between two stars  
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}	
		
		//Pyramid 
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				//prints space between two stars  
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//Diamond 
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n-i;j++) {
				//prints space between two stars  
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		int spaceCount =1;
		for (int i=1;i<=n-1;i++) {
			for(int j=1;j<=spaceCount;j++) {
				//prints space between two stars  
				System.out.print(" ");
			}
			spaceCount++;

			for (int j=0;j<n-i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
		//Downward Triangle Star Pattern
		for(int i=0;i<n;i++) {
			for(int j=n-i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Mirrored Right Triangle Star Pattern
		for(int i=0;i<n;i++) {
			for (int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Reverse Pyramid Star Pattern
		int space =0;
		for (int i=0;i<n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			space++;
			for(int j=n;j>i;j--) {
				System.out.print(" *");
			}
			System.out.println();
		}

		//Right Pascal's Triangle
		for(int i =0;i<n;i++) {
			for (int j=0;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		for(int i=n-1; i>0;i--) {
			for (int j=0;j<i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
		//Left Pascal's Triangle
		for(int i=0;i<n;i++) {
			for(int j=n-i; j>0; j--) {
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n-1;i>0;i--) {
			for(int j=n-i; j>=0; j--) {
				System.out.print(" ");
			}
			for(int j=1;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Sandglass Star Pattern
		for(int i=0;i<n;i++) {
			for(int k=0;k<i;k++) {
				System.out.print(" ");
			}
			for(int j=n-i;j>0;j--) {
				System.out.print(" *");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			for(int j=n-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//Diamond Star Pattern
		for (int i=1; i<= n ; i++)   
		{  
		for (int j = n; j > i ; j--)   
		{  
		System.out.print(" ");  
		}  
		System.out.print("*");  
		for (int k = 1; k < 2*(i -1) ;k++)   
		{   
		System.out.print(" ");   
		}  
		if( i==1)   
		{   
		System.out.println("");  
		}  
		else  
		{  
		System.out.println("*");   
		}  
		} 
		for (int i=n-1; i>= 1 ; i--)  
		{  
		for (int j = n; j > i ; j--)   
		{  
		System.out.print(" ");  
		}  
		System.out.print("*");  
		for (int k = 1; k < 2*(i -1) ;k++)   
		{  
		System.out.print(" ");  
		}  
		if(i==1)  
		System.out.println("");  
		else  
		System.out.println("*");  
		}  
	}
}
