package Alert_handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class banking_demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/button")).click();
	    
	    driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager");
	 
	    driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys("Akshay");
	    Thread.sleep(3000);   
	    driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys("Bankar");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")).sendKeys("111111111");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button")).click();
	    
	    Alert alert = driver.switchTo().alert();
	    String alertmessage = driver.switchTo().alert().getText();
	    Thread.sleep(2000);
	    alert.accept();
	    System.out.println(alertmessage);
        Thread.sleep(5000);
	    
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[2]")).click();
        Thread.sleep(3000);
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager/openAccount");
        Thread.sleep(2000);
        WebElement akshay = driver.findElement(By.xpath("//*[@id=\"userSelect\"]"));
        akshay.click();
	    Select select = new Select (akshay);
	    Thread.sleep(5000);
	    select.selectByValue("6");
	    
	    WebElement akshay1 = driver.findElement(By.xpath("//*[@id=\"currency\"]"));
	    akshay1.click();
	    Select select1 = new Select (akshay1);
	    Thread.sleep(5000);
	    select1.selectByValue("Rupee");
	    
	    driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button")).click();
	    
	    Alert alert1 = driver.switchTo().alert();
	    String alertmessage1 = driver.switchTo().alert().getText();
	    Thread.sleep(2000);
	    alert1.accept();
	    System.out.println(alertmessage1);
        Thread.sleep(5000);
	    
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[3]")).click();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager/list");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/form/div/div/input")).sendKeys("Akshay");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/table/tbody/tr/td[5]/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div/div/div[1]/button[1]")).click();
        
        driver.close();
	    
	    
	    
	    
	}

}
