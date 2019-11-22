package com.test.tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.test.pages.homepage;

 
import Helper.BrowserFactory;

public class Homepagetest extends BrowserFactory{
	homepage homepage;	
	
	@Test(priority=0)	
	public void Verifylinks() throws InterruptedException{
		homepage =  new homepage(driver);
		homepage.loginlink();
		WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("name")));  
	    AssertJUnit.assertEquals("Welcome Back!", driver.findElement(By.className("name")).getText());
	    driver.navigate().back();
	  
	    homepage.Registerlink();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("name")));  
	    AssertJUnit.assertEquals("Create new account", driver.findElement(By.className("name")).getText());
	    driver.navigate().back();  
	  }
	
	@Test(priority=1)	
	public void Verifytexts() throws InterruptedException{
		homepage =  new homepage(driver);
		String loginbutton = homepage.loginbuttontext();
		AssertJUnit.assertEquals(loginbutton,driver.findElement((By.linkText("LOGIN"))).getText());
		}		

}
