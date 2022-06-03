package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class vTigerLoginandLogOut {

	public static void main(String[] args) {
		String driverpath = System.getProperty("user.dir") + "\\src\\executables\\chromeDriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		String actualTitle = driver.getTitle();
		String expectedTitle = "vtiger";
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("login is succesfull");
		} else {
			System.out.println("either login is not done or Titel should be change");

		}

		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("admin");

		WebElement passwordfield = driver.findElement(By.id("password"));
		passwordfield.clear();
		passwordfield.sendKeys("Test@123");

		driver.findElement(By.className("buttonBlue")).click();
	    System.out.println(driver.getTitle());

		WebElement logoutbutton = driver.findElement(By.partialLinkText("Sign Out"));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(logoutbutton));
		
		String actualhomeTitle=driver.getTitle();
		String ExpectedhomeTitle="Dashboard";
		if(actualhomeTitle.equals(ExpectedhomeTitle)) {
			System.out.println("Login is succesfull and Home page Title is also verified");
		}else {
			System.out.println("Either login is fail or Home page Title got change");
		}
		
		driver.navigate().refresh();
		driver.findElement(By.partialLinkText("Sign Out")).click();
		driver.close();

	}

}
