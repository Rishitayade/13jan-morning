package HandelingWindow;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtilities;

public class HandelingWindow {

	public static void main(String[] args) {
		SeleniumUtilities s1 = new SeleniumUtilities();
		WebDriver driver = s1.setUp("chrome", "https://etrain.info/in");

		String homepagerwindowID = driver.getWindowHandle();
		System.out.println("home paager window ID: " + homepagerwindowID);

		driver.findElement(By.xpath("//div[p[text()='Connect With Us']]/div/a[4]")).click();

		Set<String> allwindowID = driver.getWindowHandles();
		System.out.println("All window id: " + allwindowID);

		allwindowID.remove(homepagerwindowID);
		System.out.println("All window id: " + allwindowID);

		Iterator<String> itr = allwindowID.iterator();
		String childWndId = itr.next();

		driver.switchTo().window(childWndId);
		System.out.println("linkdin text: " + driver.getTitle());
		System.out.println("linkdin url: " + driver.getCurrentUrl());
		// driver.close();

		driver.switchTo().window(homepagerwindowID);
		System.out.println("etrain text: " + driver.getTitle());
		System.out.println("etrain url: " + driver.getCurrentUrl());
		// driver.close();
		driver.quit();
	}

}
