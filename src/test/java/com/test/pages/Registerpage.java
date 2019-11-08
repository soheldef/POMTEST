package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registerpage {
	WebDriver driver;  
	   public Registerpage(WebDriver driver)
		{
		this.driver=driver;
		}
		
	   @FindBy(className="navbar-brand") static WebElement Logo;
		
		public void logo(){ 
		Logo.click();

		}

}
