package FrameHandeling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtilities;

public class DragAndDropFrame {

	public static void main(String[] args) {
		SeleniumUtilities s1=new SeleniumUtilities();
		WebDriver driver=s1.setUp("chrome", "https://jqueryui.com/droppable/");
		Actions act=new Actions(driver);
	//	driver.switchTo().frame(0);

		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement src=driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
		WebElement drop=driver.findElement(By.id("droppable"));
		act.dragAndDrop(src, drop).build().perform();
		//get back your cntrol to main page
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector(".logo>a")).click();
	}

}
