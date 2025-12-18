package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MissingElement {

	public static void main(String[] args) 
	{
		//Declaring the array
		int[] array= {1,2,3,4,10,6,8};
		

		//Creating list name 
		List<Integer> arranged=new ArrayList<Integer>();
		
		//Iterating and assigning array to List
		for (Integer n : array) 
		{
			//Adding the array value to list
			arranged.add(n);
		
		}
		//Sorting the List
		Collections.sort(arranged);
		
		//Printing the Sorted List
		System.out.println("Sorted array:"+" "+ arranged);
		
		//Iterating to find missing number
	    for(int i=1;i<arranged.size()-1;i++)
	    {
	    
	    	//Getting the first value
		    int current=arranged.get(i);
		    
		    //Getting second value
		    int next=arranged.get(i+1);
		    
		    //Missing number
		    int gap=next-current;
		    
		//Iterating and finding the missing number
		for (int j = 1; j < gap; j++) 
		{
			//Printing missing number in console
			System.out.println(current+j+" ");
			
		}
		
		
		
		
	    }

}
}
