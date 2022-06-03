package mouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtilities;

public class MouseOperations {

	public static void main(String[] args) {
		SeleniumUtilities s1=new SeleniumUtilities();
		WebDriver driver=s1.setUp("chrome","http://demo.automationtesting.in/Register.html");
		WebElement username=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		username.sendKeys("admin");
		
		Actions act = new Actions(driver);
		act.moveToElement(username).doubleClick();
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		WebElement lastname=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
         act.moveToElement(lastname).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
	}

}
