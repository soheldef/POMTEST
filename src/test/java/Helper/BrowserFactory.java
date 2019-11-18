package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class BrowserFactory {
	public static final String quitbrowser = null;
	static WebDriver driver;
	
	public static WebDriver StartBrowser(){
		String location = System.getProperty("user.dir");
		System.out.print(location);
		System.setProperty("webdriver.chrome.driver", location+"/Chromedriver/chromedriver");
		driver = new ChromeDriver();			
		driver.manage().window().maximize();
		driver.get("https://find-garage.com");
		return driver;
	  }
	
	@AfterClass
    public static void quitbrowser(){
		driver.quit();
	  }
	
	
	}