package week3.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		
		//Initialize the array with values
		int[] numb= {1,4,3,2,8,6,7};
		
		//Sorting the array
		Arrays.sort(numb);
		
		//Iterating from index 0 to array length
		for(int i=0;i<numb.length;i++) 
		{
			//Checking and finding which numb is missing from the array
			if(numb[i]!=i+1)
			{
				//Printing the missing number
				System.out.println("Missing number is" + " "+ (i+1));
				break;
			}
		}

	}

}
