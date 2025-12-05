package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
	
		int n = 8 ;              //number of output required
		int a=0, b=1;            // Initializing first and second number
		System.out.println(a);   // First series printed
		System.out.println(b);   // Second series printed
	
		for(int i=3; i<=n; i++)
		{
			int c=a+b;             // Sum of first number and second number
			System.out.println(c); // Print the output
			 a=b;                  // reassigning to second number
			 b=c;                  //reassigning to output which is sum of first and second number
			
			
		}
		
		

	}

}
