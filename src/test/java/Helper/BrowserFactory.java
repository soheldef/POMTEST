package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	static WebDriver driver;
	
	public static WebDriver StartBrowser(){
		
		System.setProperty("webdriver.chrome.driver", "/home/sohel/Downloads/eclipse-installer/gecko/chromedriver");
		driver = new ChromeDriver();			
		driver.manage().window().maximize();
		driver.get("https://dev.findgarages.com/");
		return driver;
	  }
	
    public void quitbrowser(){
		driver.quit();
	  }
	
	
	}