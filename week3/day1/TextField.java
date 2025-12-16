package week3.day1;

public class TextField extends WebElement{
	
	public void getText() {
		System.out.println("Get the text from text field");
	}

	public static void main(String[] args) {
		TextField subclass2=new TextField();
		subclass2.click();
		subclass2.setText(null);
		subclass2.getText();
		

	}

}
