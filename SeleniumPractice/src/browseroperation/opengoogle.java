package browseroperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class opengoogle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\src\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		System.out.println("get current url:" + driver.getCurrentUrl());
		System.out.println("get current url:" + driver.getTitle());
		System.out.println("get pager sorcecode:" + driver.getPageSource());
		String sourcecode = driver.getPageSource();
		System.out.println("length of source code:" + sourcecode.length());
		System.out.println("get current url:" + driver.getCurrentUrl());
		System.out.println("get current url:" + driver.getTitle());
		driver.close();

	}

}
