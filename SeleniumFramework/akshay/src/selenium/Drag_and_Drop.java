package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        
		WebDriver driver = new ChromeDriver(options);
	    driver.get("https://testpages.herokuapp.com/styled/drag-drop-javascript.html");
	    Actions act = new Actions (driver);
	    
	    // Drag
	    WebElement drag1 = driver.findElement(By.xpath("//*[@id=\"draggable2\"]"));
	    WebElement drag2 = driver.findElement(By.xpath("//*[@id=\"draggable1\"]"));
	    
	    //Drop
	    WebElement drop1 = driver.findElement(By.xpath("//*[@id=\"droppable1\"]"));
	    WebElement drop2 = driver.findElement(By.xpath("//*[@id=\"droppable2\"]"));
	    
	    Thread.sleep(2000);
	    act.clickAndHold(drag1).moveToElement(drop1).release().build().perform();
	    Thread.sleep(2000);
	    act.clickAndHold(drag2).moveToElement(drop2).release().build().perform();
	}
}
