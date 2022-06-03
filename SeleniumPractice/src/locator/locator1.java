package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locator1 {

	public static void main(String[] args) {

		String driverPath = System.getProperty("user.dir") + "\\src\\executables\\\\chromeDriver.exe";
		// step1: set driver executable path by using System.setProperty(String
		// key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath);
		// step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.actitime.com/login.do");

		String expectedTitle = "actiTIME - Login";
		String actualTitle = driver.getTitle();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle().length());
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Login page opened sucessfully...");
		} else {
			System.out.println("Either login page not opened or page title got changed");
		}
		WebElement usernameInputField = driver.findElement(By.id("username"));
		usernameInputField.sendKeys("admin");
		usernameInputField.clear();
		usernameInputField.sendKeys("admin");

		WebElement passInputField = driver.findElement(By.name("pwd"));
		passInputField.sendKeys("manager");

		WebElement loginbuttoninputfield = driver.findElement(By.linkText("Login"));
		loginbuttoninputfield.click();
	}
}
