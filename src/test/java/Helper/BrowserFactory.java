package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	public static final String quitbrowser = null;
	public WebDriver driver;
	
	@BeforeClass
	public void StartBrowser(){			
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();			
		driver.manage().window().maximize();
		driver.get("https://dev.find-garage.com/");
	  }
	
	@AfterClass
    public void quitbrowser(){
		driver.quit();
	  }
	
	
	}
