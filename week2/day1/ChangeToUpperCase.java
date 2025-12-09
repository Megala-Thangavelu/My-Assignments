package week2.day1;

public class ChangeToUpperCase {

	public static void main(String[] args) {
		
		String test="changeme";                      //Initialize string where odd array need to change to uppercase
		
		char[] charArray = test.toCharArray();       //String is converted to charArray
		
		for(int i=charArray.length-1; i>=0; i--)     //Iterating from reverse to find the odd position
		{
			if(i % 2==1)                             //checking if it is odd position or not
			{
				charArray[i]=Character.toUpperCase(charArray[i]); //converting odd position character to upper case 
				
			}
		}
		for (int i=0;i<=charArray.length-1;i++)       //iterating to print the character Array
		    {
			System.out.print(charArray[i]);           //printing characters 
				
			}
}
}
