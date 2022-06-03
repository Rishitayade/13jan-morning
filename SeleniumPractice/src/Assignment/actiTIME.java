package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiTIME {

	public static void main(String[] args) {
		String chromebrowser = System.setProperty("webdriver.chrome.driver", ".\\src\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		System.out.println("get title" + driver.getTitle());
		System.out.println("current url" + driver.getCurrentUrl());
		System.out.println("get page source code" + driver.getPageSource());
		String sourcecode = driver.getPageSource();
		System.out.println("lenth of source code" + sourcecode.length());
	//	driver.close();
	}

}
