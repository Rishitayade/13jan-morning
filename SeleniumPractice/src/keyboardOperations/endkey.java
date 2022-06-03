package keyboardOperations;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtilities;

public class endkey {

	public static void main(String[] args) {
		SeleniumUtilities s1=new SeleniumUtilities();
		WebDriver driver=s1.setUp("chrome","https://www.flipkart.com/");
		try {
			WebElement element=driver.findElement(By.cssSelector("body"));
			element.sendKeys(Keys.ESCAPE);
	}catch(NoSuchElementException e) {
		
	}
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
	}

}
