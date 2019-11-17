package com.test.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class homepage {
	
   static WebDriver driver;  
   public homepage(WebDriver driver)
	{
	this.driver=driver;
	}
	
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
	//public String loginbuttontext = driver.findElement((By) LoginButton).getText();
	//public String registerbuttontext = RegisterButton.getText();
	//public String aboutustext = Aboutus.getText();
	
	 
}
