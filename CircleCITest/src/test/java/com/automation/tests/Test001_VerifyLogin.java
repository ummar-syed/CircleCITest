package com.automation.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.android.UIpages.HomeScreen;
import com.android.testBase.TestBase;

public class Test001_VerifyLogin extends TestBase
{
	HomeScreen home;
	
	@BeforeClass
	public void setup() throws Exception
	{
		setUp();	
	}
	
	@Test
	public void VerifyLogin()
	{
		home = new HomeScreen(driver);
		home.LogintoApp("demo","demopass");
	}
	@AfterClass
	public void endTest()
	{
		driver.quit();
	}

}
