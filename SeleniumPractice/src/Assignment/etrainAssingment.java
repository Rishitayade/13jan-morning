package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtilities;

public class etrainAssingment {

	public static void main(String[] args) {
		SeleniumUtilities s1 = new SeleniumUtilities();
		WebDriver driver = s1.setUp("chrome", "https://etrain.info/in");

		driver.findElement(By.xpath("//input[@id='tbsfi1']")).sendKeys("pune");
	}

}
