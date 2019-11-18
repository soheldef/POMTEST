package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class BrowserFactory {
	public static final String quitbrowser = null;
	static WebDriver driver;
	
	public static WebDriver StartBrowser(){
		System.setProperty("webdriver.chrome.driver", "/Users/sohelsorwar/Documents/Work/eclipse-workspace/POMTEST/Chromedriver/chromedriver");
		driver = new ChromeDriver();			
		driver.manage().window().maximize();
		driver.get("https://finds-garages.com");
		return driver;
	  }
	
	@AfterClass
    public static void quitbrowser(){
		driver.quit();
	  }
	
	
	}
