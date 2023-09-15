package Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.setProperty("WebDriver.driver.chrome", "C:\\Users\\User\\Downloads\\chromedriver_win32.exe");
 
 WebDriver driver = new ChromeDriver();
 
 driver.get("http://omayo.blogspot.com/");
 
 driver.manage().window().maximize();
 
 WebElement Context = driver.findElement(By.xpath("//*[@id=\"BlogSearch1_form\"]/form/table/tbody/tr/td[1]/input"));
 
 Actions action = new Actions(driver);
 
 action.contextClick(Context).build().perform();
	}

}
