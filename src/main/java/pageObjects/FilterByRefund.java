package pageObjects;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FilterByRefund {
	
	WebDriver driver;
	By SearchBox = By.xpath("//input[@type='search']");
	By Hotels= By.xpath("//span//span[contains(text(),'Hotels')]");
	By Filter= By.xpath("//span[contains(text(),'Filters')]");	
	By Refundfilter = By.xpath("//label//span//div[contains(text(),'Fully refundable')]");
	By Refundablehotels = By.xpath("//div[contains(text(),'Fully refundable')]");
	By ApplyButton = By.xpath("//span[contains(text(),'Apply')]");
	
	public FilterByRefund(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement getSearchBox() {
		return this.driver.findElement(this.SearchBox);
	}
	public WebElement getHotels() {
		return this.driver.findElement(this.Hotels);
	}
	public WebElement getFilter() {
		return this.driver.findElement(this.Filter);
	}
	
	public WebElement getRefundfilter() {
		return this.driver.findElement(this.Refundfilter);
	}
	
	public List< WebElement> getRefundablehotels() {
		return this.driver.findElements(this.Refundablehotels);
	}
	
	public WebElement getApplyButton() {
		return this.driver.findElement(this.ApplyButton);
	}

}
