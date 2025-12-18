package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SortingUsingCollection {

	public static void main(String[] args) 
	{
		//Declaring the string array
		String[] array= {"HCl","Wipro","Aspire System","CTS"};
		
		//Changing to Dynamic array
		List<String> company=new ArrayList<String>();
		
		//Iterating through array 
		for (String listcoll : array) 
		{
			//Adding array to list
			company.add(listcoll);
			
			//Sorting the array
			Collections.sort(company);
			
		}
		//reversing the order 
		Collections.sort(company,Collections.reverseOrder());
		
		//Printing the List in console
		System.out.println("Reversed string :" + " "+company );
			
		
		
		

	}

}
