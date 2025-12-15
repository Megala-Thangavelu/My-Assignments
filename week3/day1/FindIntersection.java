package week3.day1;

public class FindIntersection {

	public static void main(String[] args) {
		
		//Initialize array1
		int a[]= {3,2,11,4,6,7};
		
		//Initialize array2
		int b[]= {1,2,8,4,9,7};
		
		//Iteration of 1st array values
		for(int i=0;i<a.length;i++)
		{
			//Iteration of 2nd array values
			for(int j=0;j<b.length;j++)
			{
				//check if any matching values are available 
				if(a[i]==b[j])
				{
					//Print the matching element
					System.out.println("The matching elements are :" + " " + a[i] );
					break;
				}
			}
		}
		
	}

}
