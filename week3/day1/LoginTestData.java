package week3.day1;

public class LoginTestData extends TestData {
	
	public void enterUsername1() {
		
        System.out.println("Enter the username: Megala");
	}
	
	public void enterPassword1() {
	    System.out.println("Enter the password : Fhjkk");

	}

	public static void main(String[] args) {
		
		LoginTestData data=new LoginTestData();
		data.enterCredentials();
		data.enterUsername1();
		data.enterPassword1();
		data.navigateToHomePage();
		
	}

}
