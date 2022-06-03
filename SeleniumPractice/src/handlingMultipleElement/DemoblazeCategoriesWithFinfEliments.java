package handlingMultipleElement;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoblazeCategoriesWithFinfEliments {

	public static void main(String[] args) {
		String driverpath = System.getProperty("user.dir") + "\\src\\executables\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", driverpath);

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.demoblaze.com/");
		List<WebElement> catagories = driver.findElements(By.cssSelector(".list-group>a"));
		System.out.println("option count is " + catagories.size());
		List <String> l1 = new ArrayList <String>();
		l1.add("CATEGORIES");
		l1.add("Phones");
		l1.add("Laptops");
		l1.add("Monitors");
		for (int i = 0; i < catagories.size(); i++) {
			WebElement cat = catagories.get(i);
			System.out.println("list of Eliments is:" + cat.getText());

			System.out.println(cat.isDisplayed());
			System.out.println(cat.isEnabled());
			System.out.println(cat.getText().equals(l1.get(i)));
		}
	}

}
