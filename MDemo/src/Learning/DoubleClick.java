package Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.setProperty("Webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32.exe");
  
  WebDriver driver = new ChromeDriver();
  
  driver.manage().window().maximize();
  
  driver.get("http://omayo.blogspot.com/");
  
  WebElement DoubleClick = driver.findElement(By.id("testdoubleclick"));
  
  Actions actions = new Actions(driver);
  
  actions.doubleClick(DoubleClick).build().perform();
  
  
  
	}

}
