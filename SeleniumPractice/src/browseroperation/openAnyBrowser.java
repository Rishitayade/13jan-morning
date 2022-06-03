package browseroperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openAnyBrowser {

	public static void main(String[] args) {
      String chromedriver=System.getProperty("user.dir")+"\\src\\executables\\chromedriver.exe"	;
      String firefoxdriver=System.getProperty("user.dir")+"\\src\\executables\\geckodriver.exe";
       openbrowser(firefoxdriver,"firefox");
	}
	static void openbrowser(String driverpath, String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
		 System.setProperty("webdriver.chrome.driver", driverpath);
		 WebDriver driver= new ChromeDriver();
		}else if(browsername.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", driverpath);
			WebDriver driver=new FirefoxDriver();
		}
	}
}