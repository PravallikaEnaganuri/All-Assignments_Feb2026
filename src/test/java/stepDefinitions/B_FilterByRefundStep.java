package stepDefinitions;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.FilterByRefund;


public class B_FilterByRefundStep extends Base{
	FilterByRefund priceRefundPage;
	 String inputRange ="Fully refundable";
	 List<WebElement>hotellist=new ArrayList<>();
	private static final Logger logger =
	LogManager.getLogger(B_FilterByRefundStep.class);
	@Given("user is on search screen and desination {string} is entered")
	public void user_is_on_search_screen_and_desination_is_entered(String desination) {
		try {
		 	Thread.sleep(3000);
		 	getDriver().get(this.getUrl());
		    Thread.sleep(3000);
		    priceRefundPage =new FilterByRefund (getDriver());
		    priceRefundPage.getSearchBox().sendKeys(desination);
		    Thread.sleep(3000);
	}
	catch(Exception ex)
	{
		System.out.println(ex.getMessage());
		logger.debug("Exception occurred:"+ex.getMessage());
	}
		
	   
	}
	@When("Filter  is selected")
	public void filter_is_selected() {
		try {
		WebElement hotel = priceRefundPage.getHotels();
		   hotel.click();
			 Thread.sleep(3000);
			
			WebElement filter = priceRefundPage.getFilter();
			filter.click();
			
			 Thread.sleep(3000);
			
			WebElement refund =  priceRefundPage.getRefundfilter();
			refund.click();
			 Thread.sleep(3000);
			 
			 WebElement apply =  priceRefundPage.getApplyButton();
			   apply.click();
				 Thread.sleep(3000);
		     hotellist = priceRefundPage.getRefundablehotels();
			 
	}
	
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			logger.debug("Exception occurred:"+ex.getMessage());
		}
	
}

	

	@Then("hotel is validated")
	public void hotel_is_validated() {
		try 
		{	
			for(int i=1;i<=hotellist.size();i++)
		    {	   
		     String text=getDriver()
		     .findElement
		     (By.xpath("//div[contains(text(),'Fully refundable')]"))
		    	 .getText();
		    
		     System.out.println(text);
		   
		    
		     if(inputRange.equals("Fully refundable") && !text.isEmpty())
		     {
			        String value = "Fully refundable";
			        // Assertion
			        Assert.assertSame(value, "Hotel has Refund Option");
		     }
		     
		     else
		    	 
		     {
		    	  String value = "Fully refundable";
		    	 Assert.assertNotEquals(value ,"Hotel has no Refund Option");
		     }
		             
		    }
		
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			logger.debug("Exception occurred:"+ex.getMessage());
		}
	   
	}

}
 