package stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class A_ValidateLoginFunctionality extends Base {

	LoginPage loginPage;
	private static final Logger logger =LogManager.getLogger(A_ValidateLoginFunctionality.class);
		@Given("user is home page")
		public void user_is_home_page() {
			try {
				 Thread.sleep(3000);
				logger.debug("Reached Method");
				getDriver().get(this.getUrl());
				 Thread.sleep(3000);
				//this.get(this.getUrl());  
				logger.debug("URL Launched");
			   	getDriver().manage().window().maximize();
			    logger.debug("Window Maximized");
			    Thread.sleep(3000);
				
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
				//logger.error("Exception occurred:"+ex.getMessage());
			}
				    
		   
		}
		@When("clicks login")
		public void clicks_login() {
			try {
				  loginPage=new LoginPage(getDriver());
				  Thread.sleep(3000);
				    loginPage.getsignInBtn().click();
				    Thread.sleep(3000);
				    loginPage.getcontinueWithemailBtn().click();
				    Thread.sleep(3000);
				
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
				logger.error("Exception occurred:"+ex.getMessage());
			}
		   
		}
		@When("user enters email {string} and password {string}")
		public void user_enters_email_and_password(String email, String password) {
			try {
				 loginPage.getEmail().sendKeys(email);
				    Thread.sleep(3000);
				    loginPage.getPassword().sendKeys(password);
				    Thread.sleep(3000);
				
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
				logger.error("Exception occurred:"+ex.getMessage());
			}
		   
		}
		@Then("user is sucessfully logged in")
		public void user_is_sucessfully_logged_in() {
			try {
				 Thread.sleep(2000);
				  loginPage.getSubmitBtn().click();
				  Thread.sleep(2000);
				  Assert.assertTrue(loginPage.getLoginText().getText().contains("Where"),"Login failure");
				 logger.debug("User is successfully logged in");
				  Thread.sleep(3000);
				
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
				logger.error("Exception occurred:"+ex.getMessage());
			}
		   
		}

}
