package utilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utils 
{
//   public WebDriver driver;
   
   //constructor method
   
   public Utils() 
   {
	   
   }
   
   //operational methods
   
   
   public void selectDate(WebDriver driver)
   {
	// Identify the date picker input element using its ID (or any other appropriate locator)
	   WebElement datePicker = driver.findElement(By.className("calendar"));
	   
	// Click the input field to open the calendar pop-up
	   datePicker.click();
	  
	// Get the desired date you want to select (for example, today's date)
	   LocalDate desiredDate = LocalDate.now();
	   
	// Format the desired date in the format expected by the date picker (e.g., "MM/dd/yyyy")
	   String formattedDate = desiredDate.format(DateTimeFormatter.ofPattern("dd/MMM/yyyy"));
	   
	// Find all date cells within the calendar table
       List<WebElement> dateCells = driver.findElements(By.xpath("//div[@class='calendar-month']/div"));
       
    // Loop through the date cells and click the one matching the desired date
       for (WebElement dateCell : dateCells) {
           if (dateCell.getText().equals(String.valueOf(desiredDate.getDayOfMonth()))) 
           {
               dateCell.click();
               break;
           }
	   
       }
   }
       
//    public void screenshotMethod()
//      {
//    	// Take the screenshot and store it as a file
//          File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//
//          // Specify the location where you want to save the screenshot
//          String screenshotPath = "path/to/screenshot.png";
//
//          // Copy the screenshot file to the specified location
//          try {
//              FileUtils.copyFile(screenshotFile, new File(screenshotPath));
//              System.out.println("Screenshot saved at: " + screenshotPath);
//          } 
//          catch (IOException e) {
//              e.printStackTrace();
//          }
//      }
//    
    
}
	
