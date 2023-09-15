package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Waits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	    driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("//*[@id=\"btn1\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"txt1\"]")).sendKeys("akshay");
	    
	    driver.findElement(By.xpath("//*[@id=\"btn2\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"txt2\"]")).sendKeys("bhau");
	    
	}

}
