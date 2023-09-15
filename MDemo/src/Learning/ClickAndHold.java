package Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("WebDriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32.exe");
    
    WebDriver driver = new ChromeDriver();
    
    driver.manage().window().maximize();
    
    driver.get("https://www.jqueryscript.net/demo/tap-hold-event-handler/");
    WebElement clickAndHold =  driver.findElement(By.id("1"));
    
    Actions action = new Actions(driver);
    
    action.clickAndHold(clickAndHold).build().perform();
    
    
	}

}
