package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class vtigerLogIn {

	public static void main(String[] args) {
		String driverpath = System.getProperty("user.dir") + "\\src\\executables\\chromeDriver.exe";

		System.setProperty("webdriver.chrome.driver", driverpath);

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.vtiger.com/vtigercrm/index.php");

		String acutualtitle = driver.getTitle();
		String expectedtitle = "vtiger";
		if (acutualtitle.equals(expectedtitle)) {
			System.out.println("login is succesfully done");
		} else {
			System.out.println("login is not done or title must be change");
		}
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle().length());
		WebElement usernameinputfield = driver.findElement(By.id("username"));
		System.out.println(usernameinputfield.isDisplayed());
		usernameinputfield.clear();
		usernameinputfield.sendKeys("admin");

		WebElement passwordinputfield = driver.findElement(By.className("used"));
		passwordinputfield.clear();
		passwordinputfield.sendKeys("Test@123");

		WebElement loginbutton = driver.findElement(By.tagName("button"));
		loginbutton.click();
	}

}
