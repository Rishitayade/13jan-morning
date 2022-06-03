package day7WebDriverManagersetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webDriverManagerSetUp  {

	public static void main(String[] args) {
	//	String chromebrowser = System.setProperty("webdriver.chrome.driver", ".\\src\\executables\\chromedriver.exe");
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://demo.actitime.com/login.do");
	}

}
