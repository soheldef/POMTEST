package com.test.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.test.pages.Aboutus;
import com.test.pages.Loginpage;
import com.test.pages.Registerpage;
import com.test.pages.homepage;

 
import Helper.BrowserFactory;

public class Homepagetest extends BrowserFactory{
	WebDriver driver = BrowserFactory.StartBrowser();
	homepage homepage = PageFactory.initElements(driver,homepage.class);	
	Loginpage loginpage = PageFactory.initElements(driver,Loginpage.class);	
	Aboutus aboutus = PageFactory.initElements(driver,Aboutus.class);	
	Registerpage register = PageFactory.initElements(driver,Registerpage.class);	
	
	@Test
	public void Verifylinks(){
		homepage.loginlink();
	    WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("name")));  
	    Assert.assertEquals("Welcome Back!", driver.findElement(By.className("name")).getText());
	    loginpage.logo();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
	    homepage.Registerlink();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("name")));  
	    Assert.assertEquals("Create new account", driver.findElement(By.className("name")).getText());
	    register.logo();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	  
	    homepage.Aboutus();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-page-layout/main/app-about-us/div/h1")));  
	    Assert.assertEquals("About FindGarage.com", driver.findElement(By.xpath("/html/body/app-root/app-page-layout/main/app-about-us/div/h1")).getText());
	    aboutus.logo();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	  }
	
	@Test
	public void Verifytexts(){
		String loginbutton = homepage.loginbuttontext();
		Assert.assertEquals(loginbutton,driver.findElement((By.linkText("LOGIN"))).getText());
		System.out.println(loginbutton);
		
		driver.quit();
			
		}
		

}
