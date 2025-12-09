package week2.day1;

public class Browser {
	
	public String launchBrowser(String browserName) {
		System.out.println("It is Chrome Browser");
		return browserName;
		
		}
	public void LoadUrl() {
		
		System.out.println("URL loaded successfully");
		
	}

	public static void main(String[] args) {
		
		Browser name = new Browser();
		name.launchBrowser("chrome");
		name.LoadUrl();
		
		
	}
}
