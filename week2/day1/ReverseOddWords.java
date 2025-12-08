package week2.day1;

public class ReverseOddWords {

	public static void main(String[] args) {
		String test="I am a software tester"; 
		String[] word = test.split(" "); //Splitting into separate words by using delimiter 
		
		
		for (int i=0;i<word.length;i++)  // Iterating to find the odd words
		{
			if(i % 2 ==1) {              // Checking the odd words
				char[] wc = word[i].toCharArray(); // changing string into character array
				
				String reversed=""; //Initializing variable for reversing 
				
				for(int j=wc.length-1;j>=0;j--)  //iterating to get reversed string 
				{
					
							reversed=reversed+wc[j]; //storing reversed string in variable
				}
				word[i]=reversed; // Reassigning reversed string 
			}}
		
				
			for(int i=0;i<word.length;i++)	// Iterating to display reversed string and also original even string
			{
				System.out.print(word[i]+ " "); //printing the output
			}
	
			
		}
	
}



