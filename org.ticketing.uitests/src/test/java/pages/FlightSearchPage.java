package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utilities.Utils;


public class FlightSearchPage
{	
	    public WebDriver driver;
	    public Utils utility;
	    WebDriverWait wait;
	   
	    
	    public FlightSearchPage(WebDriver driver) 
	    {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	        this.utility = new Utils();  
	        this.wait=new WebDriverWait(driver, 30);

	        
	    }
	    
	 // Locators
	    @FindBy(xpath="//button[@id='ensCloseBanner']")
	    WebElement banner;
	    
	    @FindBy(name="origin")
	    WebElement departureCityInput;
	    
	    @FindBy(name="destination")
	    WebElement  destinationCityInput;
	    
	    @FindBy(xpath="//span[@class='checkbox']")
	    WebElement oneWayRadioButton;
	    
	    @FindBy(xpath="//span[text()='Departing']")
	    WebElement departureDateInput;
	    
	    @FindBy(xpath="//button[contains(@class,'search-submit')]")
	    WebElement searchFlightsButton;
	   
	   
		public void clickBanner()
		{
			this.banner.click();
			wait.until(ExpectedConditions.visibilityOf(departureCityInput));
		}
	       
	    
	    public void enterDepartureCity(String departureCity)  
	    {	
	    	this.departureCityInput.clear();
	        this.departureCityInput.sendKeys("London Heathrow",Keys.ENTER);
	        wait.until(ExpectedConditions.visibilityOf(destinationCityInput )); 
	    }

	    public void enterDestinationCity(String destinationCity) 
	    {
	    	this.destinationCityInput.clear();
	    	((RemoteWebDriver) driver).executeScript("arguments[0].value='Dubai';",this.destinationCityInput);
	    	//this.destinationCityInput.sendKeys("Dubai",Keys.ENTER);  
	    	wait.until(ExpectedConditions.elementToBeClickable(oneWayRadioButton));
	    }

	    public void selectTripType(String tripType)  {
	         	
	       // Check if the radio button is already selected
	        if (!this.oneWayRadioButton.isSelected()) {
	            // Click the radio button to select it
	        	this.oneWayRadioButton.click();
	        	wait.until(ExpectedConditions.visibilityOf(departureDateInput ));
	       }
	        
	    }

	    public void selectDepartureDate(String departureDate)
	    {
	    	
	    	utility.selectDate(driver);
	    	wait.until(ExpectedConditions.visibilityOf(searchFlightsButton ));
	            
	    }

	    public void clickSearchFlightsButton() 
	    {
	      
	       this.searchFlightsButton.click();
	    }
	    
	   
	    
//	    WebElement flightElement = resultsContainer.findElement(By.cssSelector(".flight-item"));
//        Assert.assertTrue("Flight element is displayed", flightElement.isDisplayed());
//
//        // You can use other assertions like getText() to validate specific flight details
//        String flightNumber = flightElement.findElement(By.cssSelector(".flight-number")).getText();
//        Assert.assertEquals("AB123", flightNumber);
//
//        String departureCity = flightElement.findElement(By.cssSelector(".departure-city")).getText();
//        Assert.assertEquals("London", departureCity);
//
//        String destinationCity = flightElement.findElement(By.cssSelector(".destination-city")).getText();
//        Assert.assertEquals("New York", destinationCity);

	    
	}



