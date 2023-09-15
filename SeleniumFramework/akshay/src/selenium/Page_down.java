package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Page_down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        
		WebDriver driver = new ChromeDriver(options);
		
		
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/"); 
		JavascriptExecutor j=(JavascriptExecutor) driver;
				WebElement w = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/a"));
				w.sendKeys(Keys.PAGE_DOWN);
	}

}
