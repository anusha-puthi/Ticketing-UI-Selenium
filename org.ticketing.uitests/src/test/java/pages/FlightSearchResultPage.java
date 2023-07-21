package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FlightSearchResultPage 
{
	private WebDriver driver;
	
	
	//constructor
	public FlightSearchResultPage(WebDriver driver) 
	    {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	
	//locators
	@FindBy(xpath="//div[@id='GrdEco_ULOUTBND_0']/ul/li[2]/p/span")
    WebElement resultDepartureCity;
	
	
	public void verifyDepartureCity() 
    {
    	this.resultDepartureCity.getText();
        Assert.assertEquals("LHR",resultDepartureCity );
    }
	
}
