package mouseOperations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtilities;

public class DragAndDrop {

	public static void main(String[] args) {
		SeleniumUtilities s1=new SeleniumUtilities();
		WebDriver driver=s1.setUp("chrome","https://www.globalsqa.com/demo-site/draganddrop/");
		Actions act =new Actions(driver);
		List<WebElement> dragg=driver.findElements(By.cssSelector("ul#gallery>li"));
		WebElement dropp=driver.findElement(By.xpath("//div[@id='trash']"));
        act.dragAndDrop(dragg.get(0), dropp).build().perform();
	}

}
