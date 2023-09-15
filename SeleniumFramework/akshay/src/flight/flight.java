package flight;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class flight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.google.com/search?q=flight+booking&rlz=1C1UEAD_enIN1036IN1036&oq=fli&aqs=chrome.2.69i57j46i131i199i433i465i512j0i131i433i512l2j0i433i512j0i131i433i512l2j5.4043j0j7&sourceid=chrome&ie=UTF-8");
	    
	    driver.findElement(By.cssSelector(".g:nth-child(5) .LC20lb")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".menu_Flights .chNavText"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.cssSelector(".imageSlideContainer")).click();
	    {
	      WebElement element = driver.findElement(By.id("fromCity"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).clickAndHold().perform();
	    }
	    {
	      WebElement element = driver.findElement(By.cssSelector(".react-autosuggest__input"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).release().perform();
	    }
	    driver.findElement(By.cssSelector(".searchCity")).click();
	    driver.findElement(By.cssSelector(".react-autosuggest__input")).sendKeys("ah");
	    driver.findElement(By.cssSelector("#react-autowhatever-1-section-0-item-0 .calc60 > .font14")).click();
	    {
	      WebElement element = driver.findElement(By.id("toCity"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).clickAndHold().perform();
	    }
	    {
	      WebElement element = driver.findElement(By.cssSelector(".react-autosuggest__input"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).release().perform();
	    }
	    driver.findElement(By.cssSelector(".searchToCity")).click();
	    driver.findElement(By.cssSelector(".react-autosuggest__input")).sendKeys("pu");
	    driver.findElement(By.cssSelector("#react-autowhatever-1-section-0-item-0 .calc60 > .font14")).click();
	    driver.findElement(By.cssSelector(".DayPicker-Month:nth-child(1) .DayPicker-Week:nth-child(3) > .DayPicker-Day:nth-child(6) p:nth-child(1)")).click();
	    driver.findElement(By.cssSelector(".primaryBtn")).click();
	    driver.findElement(By.cssSelector(".buttonSecondry")).click();
	    driver.findElement(By.id("listingFilterCheckbox")).click();
	    
	  }
	


	}


