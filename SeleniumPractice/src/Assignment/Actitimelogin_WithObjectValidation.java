package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actitimelogin_WithObjectValidation {

	public static void main(String[] args) {

		String driverPath = System.getProperty("user.dir") + "\\src\\executables\\\\chromeDriver.exe";
		// step1: set driver executable path by using System.setProperty(String
		// key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath);
		// step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();

		WebElement usernameInputField = driver.findElement(By.id("username"));
		usernameInputField.sendKeys("admin");
		System.out.println("user name input field visibility status is: " + usernameInputField.isDisplayed());
		System.out.println("user name input field editable status is: " + usernameInputField.isEnabled());
		String actualdefaulttextonusernamefield = usernameInputField.getAttribute("placeholder");
		System.out.println("default text validation for username input field::"
				+ actualdefaulttextonusernamefield.equals("Username"));

		WebElement passInputField = driver.findElement(By.name("pwd"));
		passInputField.sendKeys("manager");
		System.out.println("password input field visibility status is: " + passInputField.isDisplayed());
		System.out.println("password input field editable status is: " + passInputField.isEnabled());
		String actualdefaulttextonpasswordfield = passInputField.getAttribute("placeholder");
		System.out.println("default text validation for password input field::"
				+ actualdefaulttextonpasswordfield.equals("Password"));

		WebElement checkbox = driver.findElement(By.name("remember"));
		System.out.println("checkbox visibility status is: " + checkbox.isDisplayed());
		System.out.println("checkbox clickeble status is: " + checkbox.isEnabled());
		System.out.println("checkbox default status is: " + checkbox.isSelected());

		WebElement loginbuttoninputfield = driver.findElement(By.linkText("Login"));
		System.out.println("login button visibility status is::" + loginbuttoninputfield.isDisplayed());
		loginbuttoninputfield.click();
		String actualLoginbutton = loginbuttoninputfield.getText();
		System.out.println("login button name verification:" + actualLoginbutton.equals("Login"));

		driver.findElement(By.xpath("(//td[@class=\"navItem preventPanelsHiding navCell relative notSelected\"])[1]"))
				.click();
		// System.out.println(task.isDisplayed());
		// System.out.println(task.isEnabled());
		driver.findElement(By.xpath("//div[@class=\"plusIcon\"]")).click();
		driver.findElement(By.xpath("//div[@class=\"item createNewTasks\"]")).click();
		driver.findElement(By.xpath("(//input[@class=\"inputFieldWithPlaceholder\"])[1]")).sendKeys("selenium");
		driver.findElement(By.xpath("(//input[@class=\"inputFieldWithPlaceholder\"])[2]")).sendKeys("345");
		driver.findElement(By.xpath("(//td[@class=\"x-btn-center\"])[1]")).click();
		 driver.findElement(By.xpath("(//a[@title=\"Next Month (Control+Right)\" and @class=\" x-unselectable\"])[1]")).click();
		 driver.findElement(By.xpath("(//div[@class=\"value ellipsis\"])[10]")).click();
		driver.findElement(By.xpath("//span[text()='24']")).click();
	//	driver.findElement(By.cssSelector("#ext-gen143")).click();

	}
}
