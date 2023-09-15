package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Highlight_colours {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://adactin.com/HotelApp/index.php");
		JavascriptExecutor j = (JavascriptExecutor) driver;
		
		// username and password highlighted by green color and red box
		WebElement username = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		username.sendKeys("venkat");
		j.executeScript("arguments[0].setAttribute('style','background: green;border: solid 2px red');", username);
		
		WebElement password = driver.findElement(By.id("password"));
		j.executeScript("arguments[0].setAttribute('style','background: green;border: solid 2px red');", password);
		password.sendKeys("venkat@1234");
		Thread.sleep(2000);
		
		// Login button highlighted by yellow color and green box
		WebElement login = driver.findElement(By.id("login"));
		j.executeScript("arguments[0].setAttribute('style','background: yellow;border: solid 2px green');", login);
		login.click();

	}

}
