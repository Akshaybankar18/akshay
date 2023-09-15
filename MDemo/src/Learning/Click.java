package Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://demoqa.com/buttons");
	
	driver.manage().window().maximize();
	
    WebElement doubleclick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
	
	WebElement rightclick = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
	
	WebElement click = driver.findElement(By.xpath("//button[text()='Click Me']"));
	
	Actions act = new Actions(driver);
	
	act.moveToElement(doubleclick).doubleClick().build().perform();
	
	act.moveToElement(rightclick).doubleClick().build().perform();
	
	act.moveToElement(click).doubleClick().build().perform();
	
	
	}

}
