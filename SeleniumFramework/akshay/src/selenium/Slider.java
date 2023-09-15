package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	    driver.get("https://jqueryui.com/slider/#colorpicker");
	   
	    driver.manage().window().maximize();
	    driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
	    Thread.sleep(3000);
	    WebElement greenslider = driver.findElement(By.xpath("//*[@id=\"green\"]/span"));
	    Actions action = new Actions(driver);
	    Thread.sleep(3000);
	    action.dragAndDropBy(greenslider, 100, 125).perform();
	    action.dragAndDropBy(greenslider, -100, 125).perform();
	    
	    WebElement redslider = driver.findElement(By.xpath("//*[@id=\"red\"]/span"));
	    Actions action1 = new Actions(driver);
	    Thread.sleep(3000);
	    action1.dragAndDropBy(redslider, 100, 125).perform();
	    action1.dragAndDropBy(redslider, -100, 125).perform();
	    
	    WebElement blueslider = driver.findElement(By.xpath("//*[@id=\"blue\"]/span"));
	    Actions action2 = new Actions(driver);
	    Thread.sleep(3000);
	    action2.dragAndDropBy(blueslider, 100, 125).perform();
	    action2.dragAndDropBy(blueslider, -100, 125).perform();
	    
	}

}
