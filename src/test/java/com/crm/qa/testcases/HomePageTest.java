package com.crm.qa.testcases;

import java.util.ArrayList;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.UserHomePage;

public class HomePageTest extends TestBase{

	HomePage homepage;
	LoginPage loginpage;
	UserHomePage userhomepage;

	public HomePageTest(){
		super();
	}

	@BeforeMethod
	public void setUp(){
		initialisation();
		homepage = new HomePage();
		loginpage = new LoginPage();
		userhomepage =new UserHomePage();
	}


	//@Test
	public void GoToLoginPage()
	{
		 loginpage =homepage.clicOnLoginBtn();
		 userhomepage = loginpage.enterLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void verifyMenuOptionsList(){
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<String>arraylist = new ArrayList<String>();
		
		homepage.validateMenuBarOptions();
	}
	
	
	
	
	
	
	




	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
