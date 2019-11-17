package com.test.tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.test.pages.Loginpage;
import com.test.pages.homepage;

import Helper.BrowserFactory;

public class Login extends BrowserFactory{
	WebDriver driver = BrowserFactory.StartBrowser();
	homepage homepage = PageFactory.initElements(driver,homepage.class);	
	Loginpage loginpage = PageFactory.initElements(driver,Loginpage.class);	
	
	
	@Test(priority=1)	
	public void login_test(){
		homepage.loginlink();
	    WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("name")));  
	    AssertJUnit.assertEquals("Welcome Back!", driver.findElement(By.className("name")).getText());
	    loginpage.login("sohel@test.com", "123456");
	    }
	
}
