package week2.day1;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
	String text="We learn java basics as part of java sessions in java week1"; // Assigning the string
	
	
	String[] splits = text.split(" "); //Spliting string into array of words using delimiter as space

	for(int i=0;i<splits.length;i++) //Iterating one word at a time 
	{ 
		for(int j=i+1;j<splits.length;j++)  //checking one word with each other word 
		{
			if(splits[i].equalsIgnoreCase(splits[j]))  // Check if there is any matching word
			{
				splits[j]=" "; //if found duplicate it will replace it with space
				
			}
			
		}
	}
	for(int i=0;i<splits.length;i++) //iteration to print new string
	{
		System.out.print(splits[i]+" "); //Print the duplicated removed string
	}
	}

	
}
