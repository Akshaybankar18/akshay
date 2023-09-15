package TasksQuickr;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scrolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        
		WebDriver driver = new ChromeDriver(options);
		
		// method 1
	    driver.get("https://www.quikr.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		// 1) Specific scrolling
		js.executeScript("window.scrollBy(0,1000)", "");

		// 2) at element
	//	WebElement google = driver.findElement(By.xpath("//*[@id=\"group-container\"]/div/h3/span/a"));
    // 		js.executeScript("arguments[0].scrollIntoView();",google);
		
		// 3) bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight) ");
		
	}

}
