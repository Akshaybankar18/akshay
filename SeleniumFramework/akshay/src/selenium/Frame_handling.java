package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Frame_handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("hello");
	    driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"frm1\"]")));
	    
	    WebElement akshay = driver.findElement(By.xpath("//*[@id=\"selectnav1\"]"));
	    akshay.click();
	    Select select = new Select(akshay);
	    select.selectByVisibleText("- Testing");
	    Thread.sleep(3000);
	    driver.switchTo().defaultContent();
	    
	    driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"frm2\"]")));
	    driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("akshay");
	    
	    driver.switchTo().defaultContent();
	    driver.findElement(By.xpath("//*[@id=\"Label1\"]/div[2]/span[1]/a")).click();
	}

}
