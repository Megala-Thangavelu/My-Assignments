package week2.day1;

//import org.openqa.selenium.chrome.ChromeDriver;

public class CheckList {

	public static void main(String[] args) {
		//ChromeDriver driver=new ChromeDriver(); 
		//driver.get("http://leaftaps.com/opentaps/control/main"); 
		
		String name ="Yathvik";
		
		String fullName= new String ("Megala");
		
		System.out.println(name.length());
		
		System.out.println(fullName.length());
		
		if (name.equals(fullName)) {
			System.out.println("Names are equal");
			
		}else
		{
			System.out.println("Names are not equal");
		}
		
		String name1 ="Yathvik";
		String name2="yathvik";
		if (name1.equalsIgnoreCase(name2))
		{
		
		System.out.println("names are equal");
		
	}else
	{
		System.out.println("names are not equal");
		
	}
		
		
		
		
		
		
		
		
	}

}
