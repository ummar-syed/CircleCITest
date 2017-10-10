package com.android.UIpages;

import org.openqa.selenium.WebElement;
import io.appium.java_client.android.AndroidDriver;

public class HomeScreen 
{
	AndroidDriver<WebElement> driver;	
	
	WebElement username;
	
	WebElement password;
	
	WebElement login_button;
	
	public HomeScreen(AndroidDriver<WebElement> driver)
	{
		this.driver = driver;
	}
	
	public void LogintoApp(String user,String pass)
	{
		username = driver.findElementById("com.circle_ci:id/userId_EditText");
		username.sendKeys(user);
		password = driver.findElementById("com.circle_ci:id/password_EditText");
		password.sendKeys(pass);
		login_button = driver.findElementById("com.circle_ci:id/submit_Button");		
		//login_button = driver.findElementById("com.circle_ci:id/submit");		
		login_button.click();
	}
}
