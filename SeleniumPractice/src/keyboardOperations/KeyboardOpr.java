package keyboardOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardOpr {

	public static void main(String[] args) {
      WebDriverManager.chromedriver().setup();
      WebDriver driver=new ChromeDriver();
      driver.get("https://demo.actitime.com/login.do");
      driver.manage().window().maximize();
      driver.findElement(By.cssSelector("input#username")).sendKeys("admin",Keys.TAB);
      driver.findElement(By.cssSelector("input[name=\"pwd\"]")).sendKeys("manager",Keys.ENTER);;
      
	}

}
