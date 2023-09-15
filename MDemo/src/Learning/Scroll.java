package Learning;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32\\chrome.exe");
		
		WebDriver driver=new ChromeDriver();
		
	//	driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
	//	Dimension d = new Dimension(100,200);
		
	//	driver.manage().window().setSize('d');
		 
		Point p = new Point(150,500);
		
		driver.manage().window().setPosition(p);
	
		
	//	driver.manage().window().setSize(Dimension);
		
	//	driver.manage().window().setPosition(new Point(50,300));
		
	//	Thread.sleep(5000);
		
	//	JavascriptExecutor	mansi = (JavascriptExecutor) driver;
	
	//	mansi.executeScript("window.scrollBy(0,900)");
		
	//	Thread.sleep(5000);
		
	//	mansi.executeScript("window.scrollBy(0,-200)");
		
	//WebElement mansi = driver.findElement(By.xpath("_396cs4"));
		
	//	Select select = new Select(itemsPerPageDropdown) ;
		
	//	select.selectByVisibleText("3999");
		
	//	Thread.sleep(5000);
	
	//	driver.quit();
		
	}

}
