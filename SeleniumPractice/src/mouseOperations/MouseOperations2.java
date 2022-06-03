package mouseOperations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtilities;

public class MouseOperations2 {

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtilities s1 = new SeleniumUtilities();
		WebDriver driver = s1.setUp("chrome", "https://www.globalsqa.com/demo-site/");

		List<WebElement> menu = driver.findElements(By.xpath("//div[@id='menu']/ul/li/a"));
		System.out.println("Main mainu count" + menu.size());

		Actions act = new Actions(driver);

//		for(int i=0; i<menu.size();i++) {
//		WebElement option=menu.get(i);
//		act.moveToElement(option).perform();
//		Thread.sleep(1500);
		// mouseHover(act,menu);
		mouseHoverwithcord(act, menu);
	}

	static void mouseHover(Actions act, List<WebElement> menu) throws InterruptedException {

		for (int i = 0; i < menu.size(); i++) {
			WebElement option = menu.get(i);
			act.moveToElement(option).perform();
			Thread.sleep(1500);
		}
	}

	static void mouseHoverwithcord(Actions act, List<WebElement> menu) throws InterruptedException {
		WebElement option = menu.get(2);
		System.out.println("option name is" + option.getText());
		act.moveToElement(option, 100, 0).perform();
	}
}