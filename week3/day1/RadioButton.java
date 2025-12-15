package week3.day1;

public class RadioButton extends Button {
	
	public void selectRadioButton() {
		System.out.println("Select the Radio Button");

	}

	public static void main(String[] args) {
		
		RadioButton subclass4=new RadioButton();
		subclass4.selectRadioButton();
		subclass4.submit();
		subclass4.click();
		subclass4.setText(null);
		
	}

}
