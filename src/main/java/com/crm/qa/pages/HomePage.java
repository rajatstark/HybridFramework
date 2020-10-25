package com.crm.qa.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class HomePage extends TestBase{

	// Page factory
	@FindBy(xpath ="//span[text()='Log In']")
	WebElement btnLogin;

	@FindBy(xpath ="//span[text()=' sign up']")
	WebElement btnSignUp;

	@FindBy(xpath ="//span[text()=' Register now']")
	WebElement btnRegister;



	public HomePage(){

		PageFactory.initElements(driver, this);
	}


	public boolean isLoginButtonPresent(){

		boolean loginBtn = btnLogin.isEnabled();

		return loginBtn;
	}

	public boolean isSignUpButtonPresent(){

		boolean signupBtn = btnSignUp.isEnabled();

		return signupBtn;
	}

	public boolean isRegisterButtonPresent(){

		boolean registerBtn = btnRegister.isEnabled();

		return registerBtn;
	}

	public List validateMenuBarOptions(){

		ArrayList<String> al = new ArrayList<String>();
		
		for(int i=1;i<8;i++){

			String menuOList =driver.findElement(By.xpath("(//ul[@class='rd-navbar-nav']/li/a)["+i+"]")).getText();

			al.add(menuOList);
		}

		return al;
	}


	public LoginPage clicOnLoginBtn()
	{
		btnLogin.click();

		return new LoginPage();
	}













}
