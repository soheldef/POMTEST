package com.test.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class homepage {
	  
	   public homepage(WebDriver driver)
		{
		this.driver=driver;
		PageFactory.initElements(driver, this);

		}

		WebDriver driver;
		
	   //ALL LINKS AND BUTTONS
		@FindBy(linkText="LOGIN") WebElement LoginButton;
		public void loginlink(){ 
		   LoginButton.click();
		}
		
	    @FindBy(linkText="REGISTER") WebElement RegisterButton;	
		public void Registerlink(){ 
			RegisterButton.click();
		}
		
		@FindBy(linkText="About us") WebElement Aboutus;	
		public void Aboutus(){ 
			Aboutus.click();
		}
		
		//ALL TESXTS
		public String loginbuttontext() {
			String loginbuttontext = "LOGIN";
			return loginbuttontext;
			
		}	
		 
	}
