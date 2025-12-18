package week3.day3;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargest {

	public static void main(String[] args) {
		
		//Declaring num1 array
		int[] num1= {3,2,11,4,6,7};
		
		//for converting array into List providing the List name
		List<Integer> largest=new ArrayList<Integer>();
		
		//Iterate through array 
		for (Integer i : num1) 
		{
			//Add array values to List
			largest.add(i);
		}
		//Sort the List in reverse order
		Collections.sort(largest,Collections.reverseOrder());
		
		//Fetch second number providing the index as 1 since index starts from 0
		Integer secondLargest = largest.get(1);
		
		//Printing it in console
		System.out.println("Second Largest number is "+ " " + secondLargest);
		
	
	}
	}


