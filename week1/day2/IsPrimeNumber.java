package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {

		int n=79; //Number to find prime number or not
		int i;    //Initializing i
		
		for(i=2;i<= n-1; i++) //loop continues till i becomes n-1
		{
			if(n % i==0)     //to check if it is divisible by number 2 to n-1
			{
				System.out.println(n +" " + "is not a prime number");
				break;
			}
		
		   if(i==n-1)  //to check if number i is equal to n
			{
				System.out.println(n +" " + "is a prime number");
				
			}
			
	    }
	}
}


