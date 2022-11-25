package com.Testlayer;

import org.testng.annotations.Test;

import com.Pagelayer.LoginPage;
import com.Testbase.TestBase;

public class LoginPageTest extends TestBase {

	@Test
	public void LoginTest()
	{
		LoginPage ln=new LoginPage();
		ln.clickLoginButton();
		ln.enterEmail("8208610728");
		ln.enterPWD("Test@123");
	}
	
	
	
	
}
