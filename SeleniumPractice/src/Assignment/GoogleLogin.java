package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLogin {

	public static void main(String[] args) {
		String driverpath = System.getProperty("user.dir") + "\\src\\executables\\\\chromeDriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		String sourcecode = driver.getPageSource();
		System.out.println(sourcecode);
		
		System.out.println(driver.getPageSource().length());
		System.out.println(driver.getCurrentUrl());

	}

}
