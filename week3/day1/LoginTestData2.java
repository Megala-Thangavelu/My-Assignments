package week3.day1;

public class LoginTestData2 extends TestData{
	
	public void enterusername2() {
		System.out.println("Enter the username2: Yathvik");
     }

	public void enterPassword2() {
		
        System.out.println("Enter the password2: gdgsg");
	}
	public static void main(String[] args) {
		LoginTestData2 data2=new LoginTestData2();
		data2.enterCredentials();
		data2.enterusername2();
        data2.enterPassword2();
		data2.navigateToHomePage();
		

	}

}
