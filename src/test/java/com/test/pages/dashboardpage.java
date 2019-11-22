package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashboardpage {
	
	WebDriver driver;
	
	public dashboardpage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	//ALL LINKS AND BUTTONS
	@FindBy(linkText="Sign Out") WebElement LogoutButton;
	public void logoutlink(){ 
		LogoutButton.click();
	}

}
