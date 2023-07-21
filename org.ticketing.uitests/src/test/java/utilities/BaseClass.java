package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	private static WebDriver driver;
	protected static Properties properties;

    static {
        try {
            loadProperties();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void loadProperties() throws IOException {
        properties = new Properties();
        InputStream input = new FileInputStream("src/test/resources/config.properties");
        properties.load(input);
    } 
   
		 protected static void openBrowser() {
		        String browser = properties.getProperty("browser").toLowerCase();
		        switch (browser) {
		            case "chrome":
		                WebDriverManager.chromedriver().setup();
		                driver = new ChromeDriver();
		                break;
		            case "firefox":
		                WebDriverManager.firefoxdriver().setup();
		                FirefoxOptions options = new FirefoxOptions();
		                options.setProfile(new FirefoxProfile());
		                driver = new FirefoxDriver(options);
		                break;
		            // Add more cases for other supported browsers if needed
		            default:
		                throw new IllegalArgumentException("Invalid browser specified in config.properties");
		        }
		     
    }
	 public void tearDown() {
	        // Quit the WebDriver after the test
	        {
	            driver.quit();
	        }
    }

}

