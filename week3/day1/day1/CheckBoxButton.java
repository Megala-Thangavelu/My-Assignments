package week3.day1;

public class CheckBoxButton extends Button {
	
	public void checkButton() {
		System.out.println("Click on the check button");
	}

	public static void main(String[] args) {
		CheckBoxButton subclass3=new CheckBoxButton();
		subclass3.checkButton();
		subclass3.submit();
		subclass3.click();
		subclass3.setText(null);
		
		
	}

}
