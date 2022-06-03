package HandelingCalender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtilities;

public class CalanderHandeling  {

	public static void main(String[] args) {
		SeleniumUtilities s1=new SeleniumUtilities();
		WebDriver driver=s1.setUp("chrome", "https://www.makemytrip.com/");
		//driver.findElement(By.cssSelector("li[data-cy='account']")).click();
		//driver.findElement(By.cssSelector("label[for='departure']")).click();
		//driver.findElement(By.cssSelector("div.DayPicker-Months>*:last-child>.DayPicker-Body>div:nth-of-type(2)>*:nth-child(2)>div>p")).click();
	}

}
