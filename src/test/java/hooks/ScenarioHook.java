package hooks;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.io.ByteArrayInputStream;
import java.net.URL;
import org.openqa.selenium.TakesScreenshot;
import io.qameta.allure.Allure;

public class ScenarioHook extends Base{
	//RemoteWebDriver remoteDriver;
		WebDriver driver;
		@Before
		public void setup()
		{
			
				try {
					String browser=this.getBrowser();
					
					//System.out.println("java -jar src/main/resources/selenium-server-4.44.0.jar standalone");
					//if (browser.equals("chrome")) {
				       driver = new ChromeDriver();  
						//System.out.println("***REACHED IF");
						
						  ChromeOptions options = new ChromeOptions();
						  options.setCapability("platformName", "Windows");
						  
						//  remoteDriver = new RemoteWebDriver( new URL("http://localhost:4444"),options
						  
						 // );
						 
				    //}
					//else if( browser.equals("edge"))
					{
						 //driver = new EdgeDriver();  
						//grid setup
					// EdgeOptions options = new EdgeOptions();
					//	 options.setCapability("platformName", "Windows");
	
					// remoteDriver = new RemoteWebDriver(
		                //    new URL("http://localhost:4444"),options
		                    
		           // );
						 
					}
					setDriver(driver);
					//setDriver(remoteDriver);
				//	System.out.println("GRID STARTED");
					getDriver().manage().timeouts().
			        implicitlyWait(Duration.ofSeconds(10));

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
			
		
		@After
		public void tearDown(Scenario scenario)
		{
			  try
			  {
				  if (!scenario.isFailed()){
					  byte[] screenshot = ((TakesScreenshot)
			  getDriver()).getScreenshotAs(OutputType.BYTES);
			  
			  Allure.addAttachment( "Screenshot", new ByteArrayInputStream(screenshot) );
			  }
			
			
		}
			  catch (WebDriverException e) {
		            e.printStackTrace();
		        }
			  getDriver().quit();
		}



}
