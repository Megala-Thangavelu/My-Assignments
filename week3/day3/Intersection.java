package week3.day3;

import java.util.ArrayList;
import java.util.List;

public class Intersection {

	public static void main(String[] args) {
		//Declaring 1st array
		int[] num1= {3,2,11,4,6,7};
		
		//Declaring 2nd array
		int num2[]= {1,2,8,4,9,7};
		
		//To convert array into list and store values which are equal
		List<Integer> common=new ArrayList<Integer>();
		
		//Iterating through 1st array
		for(int i=0;i<num1.length;i++)
		{
			//Iterating 1st array with every value of 2nd array
			for(int j=0;j<num2.length;j++)
			{
				//Comparing both array to find if there is any matches 
				if(num1[i]==num2[j])
				{
					//Matching array is added to list name
					common.add(num1[i]);
					break;
					
				}
			}
			
		}   //Printing the list with equal values
		    System.out.println("equal values are"+" " +common);
		
		
	}

}
