package com.android.testBase;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestBase extends Constants
{
	public AndroidDriver<WebElement> driver;
	
	public void setUp() throws MalformedURLException
	{
		
		DesiredCapabilities capabilities = DesiredCapabilities.android();
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"");	    
		capabilities.setCapability("app", App_Source);
		capabilities.setCapability("platformName","Android");
		//capabilities.setCapability("deviceName",Device_Name);
		capabilities.setCapability("platformVersion",Platform_Version); 
		capabilities.setCapability("appiumVersion", "1.5.1");
capabilities.setCapability("deviceName","Samsung Galaxy S4 Emulator");
capabilities.setCapability("deviceOrientation", "portrait");
capabilities.setCapability("browserName", ""); 
		driver = new AndroidDriver<WebElement>(new URL(Constants.Url),capabilities);
	}
}





