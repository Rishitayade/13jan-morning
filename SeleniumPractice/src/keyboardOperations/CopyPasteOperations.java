package keyboardOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CopyPasteOperations {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		username.sendKeys("Rishikesh", Keys.chord(Keys.CONTROL, "a"));
		username.sendKeys(Keys.chord(Keys.CONTROL, "c"));

		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(Keys.chord(Keys.CONTROL, "v"));
		
	}

}
