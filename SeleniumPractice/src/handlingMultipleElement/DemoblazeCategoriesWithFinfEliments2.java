package handlingMultipleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoblazeCategoriesWithFinfEliments2 {

	public static void main(String[] args) {
		String driverpath = System.getProperty("user.dir") + "\\src\\executables\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", driverpath);

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.demoblaze.com/");
		List<WebElement> catagories = driver.findElements(By.cssSelector(".list-group>a"));
		System.out.println("option count is "+ catagories.size());
		WebElement cat = catagories.get(1);
		System.out.println("first element of the list is:" + cat.getText());

		System.out.println(cat.isDisplayed());
		System.out.println(cat.isEnabled());
		System.out.println(cat.getText().equals("Phones"));
		}
	
}

