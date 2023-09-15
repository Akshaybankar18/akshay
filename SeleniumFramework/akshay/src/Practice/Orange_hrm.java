package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Orange_hrm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    
	    driver.get("https://www.irctc.co.in/nget/train-search");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input")).sendKeys("pune");
	    Thread.sleep(3000);
	   // driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input")).sendKeys(Keys.DOWN);
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input")).sendKeys(Keys.ENTER);
	    
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"destination\"]/span/input")).sendKeys("mumbai");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"destination\"]/span/input")).sendKeys(Keys.ARROW_DOWN);
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"destination\"]/span/input")).sendKeys(Keys.ENTER);
	    
	    driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/input")).click();
	    Thread.sleep(3000);
	    while (true) 
	    {
	    	String month = driver.findElement(By.xpath("//span [@class = 'ui-datepicker-month ng-tns-c58-10 ng-star-inserted']")).getText();
	    	String year = driver.findElement(By.xpath("//span [@class = 'ui-datepicker-year ng-tns-c58-10 ng-star-inserted']")).getText();
	    	
	    	if (year.equals("2023")& month.equals("October"))
	    	{
	    	driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/div/div/div[2]/table/tbody/tr[3]/td[6]")).click();
	    	break;
	    	}
	    	else 
	    	{
	    	driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/div/div/div[1]/a[2]/span")).click();
	    	}
	    	
        }
	    WebElement element = driver.findElement(By.xpath("//*[@id=\"journeyClass\"]"));		
        element.click();
        Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"journeyClass\"]/div/div[4]/div/ul/p-dropdownitem[2]/li/span")).click();
	    Thread.sleep(3000);
	    
	    WebElement akshay = driver.findElement(By.xpath("//*[@id=\"journeyQuota\"]/div"));
	    akshay.click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"journeyQuota\"]/div/div[4]/div/ul/p-dropdownitem[2]/li/span")).click();
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[5]/div[1]")).click();
	    Thread.sleep(3000);
	    
	    driver.get("https://www.irctc.co.in/nget/booking/train-list");
	    driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[1]/div[2]")).click();
	    
	    	
	    	
	    	
	    }
	    
	    
	    
	    
	 }
	    
	    
	    