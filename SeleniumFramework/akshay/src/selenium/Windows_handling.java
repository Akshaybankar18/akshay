package selenium;

import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Windows_handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        
	    WebDriver driver = new ChromeDriver(options);
	      driver.get("https://www.salesforce.com/au/");
	      driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/section/div[1]/article/div[2]/div/pbc-button[1]")).click();
	   
	      driver.get("https://www.salesforce.com/au/form/signup/freetrial-sales/?d=jumbo1-btn-ft");
	      driver.findElement(By.partialLinkText("Statement")).click();
	      
	      Set<String> windowhandles = driver.getWindowHandles();
	      System.out.println(windowhandles);
	      
	      java.util.Iterator<String> iterator = windowhandles.iterator();
	      String parentwindow = iterator.next();
	      String childwindow = iterator.next();
	      String statement = iterator.next();
	      
	      driver.switchTo().window(childwindow);
	      Thread.sleep(2000);
	      driver.switchTo().window(parentwindow);
	      Thread.sleep(2000);
	      driver.switchTo().window(statement);
	    }

	 

	}
