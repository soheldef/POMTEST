package com.test.tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.pages.Loginpage;
import com.test.pages.dashboardpage;
import com.test.pages.homepage;

import Helper.BrowserFactory;

public class Login extends BrowserFactory{
	
	homepage homepage;	
	Loginpage loginpage;
	dashboardpage dashboard;
	
	@Test(priority=0)	
	public void clickLoginHome() throws InterruptedException{
		homepage = new homepage(driver);
		homepage.loginlink();
	    WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("name")));  
	    AssertJUnit.assertEquals("Welcome Back!", driver.findElement(By.className("name")).getText());
	    }
	
	@Test(priority=1)
	public void enterCredentials() throws InterruptedException{
		loginpage = new Loginpage(driver);
		loginpage.login("saymanasrin39@gmail.com","s123456");
		Thread.sleep(5000);
	}
	
	@Test(priority=2)
	public void signOut() throws InterruptedException{
		dashboard = new dashboardpage(driver);
		dashboard.logoutlink();
	    Thread.sleep(3000);
	}
	
}
