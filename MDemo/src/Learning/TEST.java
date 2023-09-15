package Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TEST {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub\\
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chrome.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
	
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Poco F1");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.findElement(By.id("a-page")).click();
		
		driver.navigate().to("https://www.youtube.com/");
		
		driver.navigate().back();
		
		driver.quit();
	}

}
