package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        
		WebDriver driver = new ChromeDriver(options);
		 driver.get("https://www.google.com/");
         driver.manage().window().maximize();
         
         WebElement akshay = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
         
         Actions action = new Actions(driver);
         action.moveToElement(akshay)
         .keyDown(Keys.CONTROL)
         .sendKeys("a")
         .click()
         .keyUp(Keys.CONTROL)
         .build()
         .perform();
         
         
         
         
	}

}
