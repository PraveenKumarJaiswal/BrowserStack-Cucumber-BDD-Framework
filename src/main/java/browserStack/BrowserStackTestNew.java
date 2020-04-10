package browserStack;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserStackTestNew 
{
	
	public static WebDriver driver;


	  @BeforeClass
	  @org.testng.annotations.Parameters({"browser","version","platform"})
	  public static void setUp(String browser, String version, String platform) throws Exception {
	    DesiredCapabilities capability = new DesiredCapabilities();
	    capability.setCapability("platform",platform);
	    capability.setCapability("browserName", browser);
	    capability.setCapability("browserVersion", version);
	    capability.setCapability("project", "P1");
	    capability.setCapability("name", "Demo 01");
	    capability.setCapability("build", "5.0");
	    capability.setCapability("capability.setCapability","errors");
	    capability.setCapability("browserstack.debug", "true");
	    driver = new RemoteWebDriver(
	      new URL("https://praveenjaiswalqa1:zHQkVoQwTZr6AskVUeJR@hub-cloud.browserstack.com/wd/hub"),
	      capability);
	  }

		

		  @AfterClass
		  public void tearDown() throws Exception {
		    driver.quit();
		  }
		}