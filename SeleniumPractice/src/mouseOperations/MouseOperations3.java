package mouseOperations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtilities;

public class MouseOperations3 {

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtilities s1 = new SeleniumUtilities();
		WebDriver driver = s1.setUp("chrome", "http://demo.automationtesting.in/Register.html");

		List<WebElement> menu = driver
				.findElements(By.xpath("//div[@class='navbar-collapse collapse navbar-right']/ul/li/a"));
		System.out.println("Main mainu count:" + menu.size());

		Actions act = new Actions(driver);

		 for(int i=0; i<menu.size();i++) { 
			 System.out.println("main mainu:  "+menu.get(i).getText());
		 WebElement option=menu.get(i);
		act.moveToElement(option).perform();;
		 Thread.sleep(1500);
	
		//mouseHover(act, menu);
	}
		 
	}
	}
	// }
//	static void mouseHover(Actions act, List<WebElement> menu) {
	//	WebElement option = menu.get(4);
	//	System.out.println("option name is" + option.getText());

	///	act.moveToElement(option, 100, 0).perform();
		

	
