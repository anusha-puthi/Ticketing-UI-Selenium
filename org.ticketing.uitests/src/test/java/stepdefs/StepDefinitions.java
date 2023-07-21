package stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FlightSearchPage;
import pages.FlightSearchResultPage;
import utilities.BaseClass;
import utilities.Utils;


    

public class StepDefinitions extends BaseClass
{
	public WebDriver driver;
	private FlightSearchPage flightSearchPage;
	private FlightSearchResultPage flightSearchResultPage;
	private Utils utility;
	private String departureCity;
	private String destinationCity;
	private String tripType;
	private String departureDate;
	WebDriverWait wait;
	
	
	@Before
	public void invokeBrowser() 
	{
		openBrowser();
	    flightSearchPage= new FlightSearchPage(driver);
		flightSearchResultPage= new FlightSearchResultPage(driver);	
		
	}        
    	
	@After
	public void afterScenario() 
	{
        tearDown(); // Call the tearDown() method to quit the WebDriver after the test scenario
    }
	
	@Given("I am on the flight search page")
	public void i_am_on_the_flight_search_page() 
	{
		String baseUrl = properties.getProperty("baseUrl");
        driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		flightSearchPage.clickBanner();
	}

	@When("I enter {string} as the departure city")
	public void i_enter_as_the_departure_city(String departureCity) throws Throwable 
	{
		flightSearchPage.enterDepartureCity(departureCity);
	}
		

	@When("I enter {string} as the destination city")
	public void i_enter_as_the_destination_city(String destinationCity) throws Throwable 
	{
		flightSearchPage.enterDestinationCity(destinationCity);	
		
	}

	@When("I select {string} as the trip type")
	public void i_select_as_the_trip_type(String tripType) throws Throwable {
	   flightSearchPage.selectTripType(tripType);
	   
	}

	@When("I select {string} as the departure date")
	public void i_select_as_the_departure_date(String departureDate) {
	    flightSearchPage.selectDepartureDate(departureDate);
	}
	

	@When("I click on the Search button")
	public void i_click_on_the_button() {
	    flightSearchPage.clickSearchFlightsButton();
	}

	@Then("I should see a list of available one-way flights from London to New York")
		public void verifyAvailableFlights(String departureCity, String destinationCity) {
	        // assertions to verify the list of available flights on the search results page
		flightSearchResultPage.verifyDepartureCity() ;
	}


}
