package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver)

	{

		this.driver=driver;

	}
	By signInBtn=By.xpath("//*[text()='Sign in']");	

	By continueWithemailBtn=By.xpath("//*[text()='Continue with email']");

	By email=By.id("regSignIn.emailInput");

	By password=By.id("regSignIn.passwordInput");

	By submitBtn=By.id("regSignUp.submit");

	By loginText=By.xpath("//div[contains (text(),'Where')]");

	

	public WebElement getsignInBtn() {

		return driver.findElement(this.signInBtn);

	}


	public WebElement getcontinueWithemailBtn() {

		return driver.findElement(this.continueWithemailBtn);

	}

 

	public WebElement getEmail() {

		return driver.findElement(this.email);

	}

 

	public WebElement getPassword() {

		return driver.findElement(this.password);

	}

 

	public WebElement getSubmitBtn() {

		return driver.findElement(this.submitBtn);

	}

	public WebElement getLoginText() {

        return driver.findElement(this.loginText);

	}

}