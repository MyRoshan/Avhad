package com.Pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Testbase.TestBase;

public class LoginPage extends TestBase {

	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement Login; 
	
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	private WebElement email;
	
	@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
	private WebElement password; 
	
	
	//Action Methods
	public void clickLoginButton()
	{
		Login.click();
	}
	
	public void enterEmail(String Email)
	{
		email.sendKeys(Email);
	}
	
	public void enterPWD(String pwd)
	{
		password.sendKeys(pwd);
	}
	
}
