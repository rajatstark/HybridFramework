package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{

	// Page Factory

	@FindBy(name="email")
	WebElement userName;


	@FindBy(name="password")
	WebElement passWord;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement loginBtn;
	
	
	//Initializing the page objects
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}

// Methods:
	
	public UserHomePage enterLogin(String uname, String pwd){
		
		userName.clear();
		userName.sendKeys(uname);
		
		passWord.clear();
		passWord.sendKeys(pwd);
		loginBtn.click();
		return new UserHomePage();
		
	}

	
	
	




}
