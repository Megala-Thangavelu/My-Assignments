package week3.day1;

public class WebElement {
	
	public void click() {
		System.out.println("Click the Element");
	}
	
	public void setText(String Text) {
		
		System.out.println("Text");

	}

	public static void main(String[] args) {
		
		WebElement super1=new WebElement();
		super1.click();
		super1.setText(null);
		
	}

}
