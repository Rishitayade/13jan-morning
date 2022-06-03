package Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {

	public static void main(String[] args) {
	//	String chromebrowser = System.setProperty("webdriver.chrome.driver", ".\\src\\executables\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com");
		System.out.println("get title:  " + driver.getTitle());
		String title = driver.getTitle();
		System.out.println("title length:" + title.length());
		System.out.println("current url" + driver.getCurrentUrl());
		// System.out.println("get page source code" + driver.getPageSource());
		String sourcecode = driver.getPageSource();
		System.out.println("lenth of source code: " + sourcecode.length());
		// driver.close();
		String actualtitle = driver.getTitle();
		String expectedtitle = "  Facebook – log in or sign up";
		if (actualtitle.equals(expectedtitle)) {
			System.out.println("login is succesfully done");
		} else {
			System.out.println("login is not done");
		}
		driver.findElement(By.cssSelector("a._42ft._4jy0._6lti")).click();

		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("rishi");
		driver.findElement(By.cssSelector("input[name=\"lastname\"]")).sendKeys("tayade");
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("9988776655");
		driver.findElement(By.cssSelector("input[name='reg_passwd__']")).sendKeys("rs1234");

		// int dobDDL=driver.findElements(By.cssSelector("._5k_4>span>select")).size();
		WebElement dayDDL = driver.findElement(By.cssSelector("._5k_4>span>select:nth-of-type(1)"));
		Select s1 = new Select(dayDDL);
		System.out.println("Is Day DDL Visible: " + dayDDL.isDisplayed()); // Is Visible
		System.out.println("Is Day DDL Enabled: " + dayDDL.isEnabled()); // Is Enabled
		System.out.println("Is Day DDL Multiseleccted: " + s1.isMultiple()); // Is Multi-selected
		List<WebElement> opt1 = s1.getOptions();
		System.out.println("Day DDL Options Count: " + opt1.size()); // Size of Day DDL
		System.out.println("Day DDL Name: " + dayDDL.getAttribute("name")); // Name of Day DDL
		System.out.println("Default Selected Option: " + s1.getFirstSelectedOption().getText()); // Default Selected
																									// Option
		s1.selectByIndex(4); // Select By Index
		s1.selectByValue("26"); // Select By Value
		s1.selectByVisibleText("15");

		WebElement monthDDL = driver.findElement(By.cssSelector("span[class=\"_5k_4\"]>span>:nth-of-Type(2)"));
		Select s2 = new Select(monthDDL);
		System.out.println("is month DDL Visible:  " + monthDDL.isDisplayed());
		System.out.println("is month DDL Enable:  " + monthDDL.isEnabled());
		System.out.println("is month multiselect: " + s2.isMultiple());
		List<WebElement> opt2 = s2.getOptions();
           System.out.println("month option count:"+opt2.size());
           System.out.println("month name:"+monthDDL.getAttribute("name"));
           System.out.println("default selected option: "+s2.getFirstSelectedOption().getText());
           
           s2.selectByIndex(10);
           s2.selectByValue("4");
	}

}
