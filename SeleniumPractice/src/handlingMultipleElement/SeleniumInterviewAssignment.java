package handlingMultipleElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumInterviewAssignment {

	public static void main(String[] args) {
		String driverpath = System.getProperty("user.dir") + "\\src\\executables\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", driverpath);

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.google.com/");

		WebElement searc = driver.findElement(By.cssSelector(".gLFyf "));
		searc.sendKeys("selenium interview questions");

		List<WebElement> search = driver.findElements(By.cssSelector("ul[class=\"erkvQe\"]>div>ul>li>div >div>div>span"));
		System.out.println("search count:" + search.size());
		for (int i = 0; i < search.size(); i++) {
			System.out.println(search.get(i).getText());
		}
	}

}
