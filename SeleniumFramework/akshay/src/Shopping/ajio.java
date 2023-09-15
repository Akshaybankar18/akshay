package Shopping;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class ajio {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        
     
        
		
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        // SIGN UP
		driver.get("https://www.ajio.com/?gclid=EAIaIQobChMIwrXy-I_W_wIVNpFmAh0PtAs3EAAYASAAEgIi4fD_BwE");
		driver.manage().window().maximize();
		
		/*driver.findElement(By.xpath("//*[@id=\"appContainer\"]/div[1]/div/header/div[1]/ul/li[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"login-modal\"]/div/div/div[2]/div/form/div[2]/div[1]/label/input")).sendKeys("7758073133");
		
		
		driver.findElement(By.xpath("//*[@id=\"login-modal\"]/div/div/div[2]/div/form/div[2]/div[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"login-modal\"]/div/div/div[2]/div/div/div[2]/form/div[1]/div[1]/input")).sendKeys("8769)"
				+ "");
		driver.findElement(By.xpath("//*[@id=\"login-modal\"]/div/div/div[2]/div/div/div[2]/form/div[2]/input")).click(); 
		
		
		driver.findElement(By.xpath("(//label[@class='gender-opt'])[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"login-modal\"]/div/div/div[2]/div/div/div[2]/form/div[5]/input")).sendKeys("akshay");	
	    driver.findElement(By.xpath("//*[@id=\"login-modal\"]/div/div/div[2]/div/div/div[2]/form/div[7]/input")).sendKeys("akshaybankar542@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\"pwdInput\"]")).sendKeys("Akshay@3133");
        driver.findElement(By.xpath("//*[@id=\"login-modal\"]/div/div/div[2]/div/div/div[2]/form/div[12]/label/input")).click();
	    driver.findElement(By.xpath("//*[@id=\"login-modal\"]/div/div/div[2]/div/div/div[2]/form/div[14]/input")).click();
	    driver.findElement(By.xpath("//*[@id=\"login-modal\"]/div/div/div[2]/div/div/div[2]/form/div/div[2]/div[1]/input")).sendKeys("8390");
	    driver.findElement(By.xpath("//*[@id=\"login-modal\"]/div/div/div[2]/div/div/div[2]/form/div/div[3]/input")).click();*/
		
		driver.findElement(By.xpath("(//a[@class=' alignTag'])[1]")).click();
		
		
		// SCROLLING
		// method 1
	    driver.get("https://www.ajio.com/shop/men");
	    driver.manage().window().maximize();
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		// 1) Specific scrolling
		js.executeScript("window.scrollBy(0,2000)", "");
		js.executeScript("window.scrollBy(0,4000)", "");
		js.executeScript("window.scrollBy(0,8000)", "");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-6000)", "");
		js.executeScript("window.scrollBy(0,-4000)", "");
		js.executeScript("window.scrollBy(0,-500)", "");
		
		Thread.sleep(4000);
		
		// 2) at element
		WebElement google = driver.findElement(By.xpath("//*[@id=\"appContainer\"]/div[2]/div/div[1]/div[37]/div/div/div/div/div[1]/div/a[2]"));
		js.executeScript("arguments[0].scrollIntoView();",google);
		
		
		driver.findElement(By.xpath("//*[@id=\"appContainer\"]/div[2]/div/div[1]/div[38]/div/div/div/div/div[3]/div/a[2]")).click();
		
		// 3) bottom
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight) ");
		
	    driver.get("https://www.ajio.com/s/starting-at-rs-399-5070-71111");
	    driver.findElement(By.xpath("//*[@id=\"facets\"]/div[2]/ul/li[4]/div/div/div")).click();
	    driver.findElement(By.xpath("//*[@id=\"facets\"]/div[2]/ul/li[4]/div/div/div[2]/ul/li[4]/div/div/label")).click();
	    
	    driver.get("https://www.ajio.com/s/starting-at-rs-399-5070-71111?query=%3Arelevance%3Abrand%3AboAt&curated=true&curatedid=starting-at-rs-399-5070-71111&gridColumns=3");
	    
	    
	    // DROPDOWN
	    Thread.sleep(5000);
	    
	    WebElement akshay = driver.findElement(By.xpath("//*[@id=\"products\"]/div[3]/div/div[3]/div/select"));
	    Select select = new Select (akshay);
	    Thread.sleep(5000);
	    select.selectByValue("discount-desc");
	    
	    
	    driver.get("https://www.ajio.com/s/starting-at-rs-399-5070-71111?query=%3Adiscount-desc%3Abrand%3AboAt&curated=true&curatedid=starting-at-rs-399-5070-71111&gridColumns=3");
	   
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"products\"]/div[4]/div[1]/div/div[1]/a/div/div[1]/div[1]/img")).click(); 
	   
	      driver.get("https://www.ajio.com/boat-boat-airdopes-402-true-wireless-earbuds-with-upto-30-hour-playback/p/4931794020_multi");
	     
	      // WINDOWS HANDLING
	      Set<String> windowhandles = driver.getWindowHandles();
	      System.out.println(windowhandles);
	      
	      java.util.Iterator<String> iterator = windowhandles.iterator();
	      String parentwindow = iterator.next();
	      String childwindow = iterator.next();
	      
	      
	      driver.switchTo().window(childwindow);
	      Thread.sleep(2000);
	      driver.switchTo().window(parentwindow);
	      Thread.sleep(2000);
	      driver.switchTo().window(childwindow);
	      
	      driver.findElement(By.xpath("//*[@id=\"appContainer\"]/div[2]/div/div/div[2]/div/div[3]/div/div[8]/div[1]/div[1]/div")).click();
	      driver.findElement(By.xpath("//*[@id=\"appContainer\"]/div[2]/div/div/div[2]/div/div[3]/div/div[8]/div[1]/div[1]/a/div")).click();
	    
	    
	    
	    
	   // SCREENSHOT
	    File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f,new File("C:\\Users\\User\\Desktop\\screenshot\\AJIOscreenshot.jpg"));

	  
	  
	}

}
