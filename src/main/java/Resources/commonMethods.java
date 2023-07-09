package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class commonMethods {

	public static void selectDropdown(WebElement element,int index) {
		

		WebElement a1 = element;
		Select s1 = new Select(a1);
		s1.selectByIndex(index);
		
		
	}


	
}
