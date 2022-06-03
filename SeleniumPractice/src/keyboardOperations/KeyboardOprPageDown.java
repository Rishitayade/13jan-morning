package keyboardOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardOprPageDown {

	public static void main(String[] args) throws InterruptedException {
      WebDriverManager.chromedriver().setup();
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.flipkart.com/");
      WebElement element=driver.findElement(By.cssSelector("body"));
      element.sendKeys(Keys.ESCAPE);
      for(int i=0; i<10;i++) {
      element.sendKeys(Keys.PAGE_DOWN);
      Thread.sleep(2000);
      }
	}

}
