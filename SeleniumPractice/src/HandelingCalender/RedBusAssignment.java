package HandelingCalender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtilities;

public class RedBusAssignment  {

	public static void main(String[] args) throws InterruptedException  {
		SeleniumUtilities s2 = new SeleniumUtilities();
		WebDriver driver=s2.setUp("chrome", "https://www.redbus.in/");
		driver.findElement(By.cssSelector("input[class=\"db\"]")).sendKeys("pune");
		driver.findElement(By.cssSelector("ul[class=\"autoFill homeSearch\"]>:nth-of-Type(2)")).click();
		driver.findElement(By.cssSelector("input[id=\"dest\"]")).sendKeys("Goa");
		driver.findElement(By.cssSelector("ul[class=\"autoFill homeSearch\"]>:nth-of-Type(4)")).click();
		driver.findElement(By.cssSelector("td[class=\"next\"]")).click();
		driver.findElement(By.cssSelector("table[class=\"rb-monthTable first last\"]>*>tr:nth-of-Type(3)>:nth-of-Type(6)")).click();
		driver.findElement(By.id("search_btn")).click();
		WebElement bus=driver.findElement(By.xpath("(//label[@class='custom-checkbox'])[4]"));
         WebDriverWait wait=new WebDriverWait(driver,20);    //explicte wait
         wait.until(ExpectedConditions.elementToBeClickable(bus));
         driver.findElement(By.xpath("(//label[@class='custom-checkbox'])[4]")).click();;
		driver.findElement(By.cssSelector(".list-chkbox>li:nth-child(3)>label")).click();
		
		List<WebElement> devices = driver.findElements(By.cssSelector("ul[class=\"bus-items\"]>div>li>div>div>div>div>div>div"));
		System.out.println("Device count: " + devices.size());
		for (int i = 0; i < devices.size(); i++) {
			System.out.println(devices.get(i).getText());

		
	}

	}
}