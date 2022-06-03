package Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class gsmarenaAssignment {

	public static void main(String[] args) {
		String driverpath = System.getProperty("user.dir") + "\\src\\executables\\chromeDriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverpath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.gsmarena.com/");
		List<WebElement> Allphones=driver.findElements(By.cssSelector(".brandmenu-v2  >ul>li>a"));
		
		System.out.println(Allphones.size());
		for(int i=0; i< Allphones.size(); i++) {
			System.out.println(Allphones.get(i).getText());
		}
		System.out.println("***********************************");
		driver.findElement(By.cssSelector("a[href=\"samsung-phones-9.php\"]")).click();
		
		
		List<WebElement> phones=driver.findElements(By.cssSelector("div[class=\"makers\"]>ul>li"));
		System.out.println(phones.size());
		
		for(int i=0; i<phones.size(); i++) {
			System.out.println(phones.get(i).getText());
			
			
		}
		
		
	}

}
