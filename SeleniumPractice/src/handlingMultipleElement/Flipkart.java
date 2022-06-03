package handlingMultipleElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) {
		String driverPath = System.getProperty("user.dir") + "\\src\\executables\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", driverPath);

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Actions act=new Actions(driver);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);

		List<WebElement> mainmenu = driver.findElements(By.cssSelector(".InyRMC._3Il5oO>div>div>a"));
		System.out.println(mainmenu.size());
		
		for(int i=0; i< mainmenu.size();i++) {
			act.moveToElement(mainmenu.get(i)).perform();
			System.out.println(mainmenu.get(i).getText());
		}

	}

}
