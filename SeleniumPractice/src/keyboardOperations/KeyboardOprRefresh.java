package keyboardOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardOprRefresh {

	public static void main(String[] args) {
      WebDriverManager.chromedriver().setup();
      WebDriver driver=new ChromeDriver();
      driver.get("https://demo.actitime.com/login.do");
      driver.manage().window().maximize();
      driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
      driver.findElement(By.cssSelector("input[name=\"pwd\"]")).sendKeys("manager");
      driver.findElement(By.cssSelector("body")).sendKeys(Keys.F5);
      driver.navigate().refresh();

	}

}
