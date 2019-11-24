package com.test.tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import com.test.pages.Loginpage;
import com.test.pages.dashboardpage;
import com.test.pages.homepage;

import Helper.BrowserFactory;

public class Login extends BrowserFactory{
	
	homepage homepage;	
	Loginpage loginpage;
	dashboardpage dashboard;
	
	String CSV_file=System.getProperty("user.dir")+"/Resources/creds_fg.csv";
	
	@Test(priority=0)	
	public void clickLoginHome() throws InterruptedException{
		homepage = new homepage(driver);
		homepage.loginlink();
	    WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("name")));  
	    AssertJUnit.assertEquals("Welcome Back!", driver.findElement(By.className("name")).getText());
	    }
	
	@Test(priority=1)
	public void enterCredentials() throws InterruptedException, CsvValidationException{
		loginpage = new Loginpage(driver);
		CSVReader reader = null;
		
		try {
			reader = new CSVReader(new FileReader(CSV_file));
			String[] cell;
			
			while((cell=reader.readNext())!=null) {
				String email = cell[0];
				String pass = cell[1];
				loginpage.login(email,pass);
				Thread.sleep(5000);
				dashboard = new dashboardpage(driver);
				String curUrl=driver.getCurrentUrl();
				System.out.println("Current URL is: " +curUrl);
				String expUrl="https://dev.finds-garages.com/dashboard";
				System.out.println("Expected URL is: " +expUrl);
				if(curUrl.equals(expUrl)) {
					dashboard.logoutlink();
				    Thread.sleep(3000);
				}
				else {
					System.out.println("Incorrect Credentials Given!");
				}
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
