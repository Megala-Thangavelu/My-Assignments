package week3.day1;

public class Button extends WebElement {
	
	public void submit() {
		System.out.println("Click on the submit option");
		
	}
	

	public static void main(String[] args) {
		
		Button subclass1=new Button();
		subclass1.submit();
		subclass1.click();
		subclass1.setText(null);
		

	}

}
