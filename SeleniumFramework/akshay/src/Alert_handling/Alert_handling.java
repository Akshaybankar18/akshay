package Alert_handling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert_handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        
		WebDriver driver = new ChromeDriver(options);
	    driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    
	    // Alert
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
	    String alertmessage = driver.switchTo().alert().getText();
	    Thread.sleep(2000);
	    alert.accept();
	    System.out.println(alertmessage);
        Thread.sleep(5000);
        
	    // Confirm Alert
	    driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
	    Thread.sleep(3000);
        Alert alert1 = driver.switchTo().alert();
	    String alertmessage1 = driver.switchTo().alert().getText();
	    Thread.sleep(2000);
	    alert.dismiss();
	    System.out.println(alertmessage1);
	    Thread.sleep(3000);
	    
	    // Prompt Alert
	    driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
	    Thread.sleep(3000);
	    Alert alert2 = driver.switchTo().alert();
	    Thread.sleep(3000);
	    alert2.sendKeys("Alert handling by automation");
	    Thread.sleep(2000);
	    String alertmessage2 = driver.switchTo().alert().getText();
	    Thread.sleep(3000);
	    alert.accept();
	    System.out.println(alertmessage2);
	    Thread.sleep(3000);
	    driver.close();
	    
	    
	    
	    
	    
	    
	}

}
