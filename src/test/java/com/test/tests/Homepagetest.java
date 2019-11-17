package com.test.tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.test.pages.Loginpage;
import com.test.pages.Registerpage;
import com.test.pages.homepage;

 
import Helper.BrowserFactory;

public class Homepagetest extends BrowserFactory{
	WebDriver driver = BrowserFactory.StartBrowser();
	homepage homepage = PageFactory.initElements(driver,homepage.class);	
	Loginpage loginpage = PageFactory.initElements(driver,Loginpage.class);		
	Registerpage register = PageFactory.initElements(driver,Registerpage.class);	
	WebDriverWait wait = new WebDriverWait(driver, 15);
	
	@Test(priority=1)	
	public void Verifylinks(){
		homepage.loginlink();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("name")));  
	    AssertJUnit.assertEquals("Welcome Back!", driver.findElement(By.className("name")).getText());
	    driver.navigate().back();
	  
	    homepage.Registerlink();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("name")));  
	    AssertJUnit.assertEquals("Create new account", driver.findElement(By.className("name")).getText());
	    driver.navigate().back();  
	  }
	
	@Test(priority=2)	
	public void Verifytexts(){
		String loginbutton = homepage.loginbuttontext();
		AssertJUnit.assertEquals(loginbutton,driver.findElement((By.linkText("LOGIN"))).getText());
		}
	
	
		

}
