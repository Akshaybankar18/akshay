package Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("WebDriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32.exe");
    
    WebDriver driver = new ChromeDriver();
    
    driver.get("http://omayo.blogspot.com/");
    
    driver.manage().window().maximize();
    
    WebElement Blog = driver.findElement(By.id("blogsmenu"));
    Actions action = new Actions(driver);
    
   action.moveToElement(Blog).build().perform();
    
	}

}
