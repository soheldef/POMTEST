package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
	WebDriver driver;
	   
	public void loginpage (WebDriver driver){
		this.driver=driver;
		}
	
	@FindBy(className="navbar-brand") static WebElement Logo;		
    public void logo(){ 
	Logo.click();

		}
    
    @FindBy(id="email") static WebElement emailfield;	
    @FindBy(id="password") static WebElement passwordfield;
    @FindBy(xpath="/html/body/app-root/app-page-layout/main/app-login/div/section/div[4]/form/div[4]/button") static WebElement loginbutton;
    
    
    public void login(String email,String pass){ 
	emailfield.sendKeys(email);
	passwordfield.sendKeys(pass);
	loginbutton.click();

		}

		 
	}

