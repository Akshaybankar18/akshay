package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class demo_form {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"post-body-3077692503353518311\"]/div[1]/div/div/h2[2]/div[1]/div/div[2]/input")).sendKeys("akshay");
		driver.findElement(By.xpath("//*[@id=\"post-body-3077692503353518311\"]/div[1]/div/div/h2[2]/div[1]/div/div[5]/input")).sendKeys("bankar");
		driver.findElement(By.xpath("//*[@id=\"sex-0\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"exp-0\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).sendKeys("24-12-1997");
		driver.findElement(By.xpath("//*[@id=\"tool-2\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"continents\"]")).click();
        WebElement dropdown = driver.findElement(By.id("continents"));
        dropdown.findElement(By.xpath("//option[. = 'Europe']")).click();
        
        WebElement dropdow = driver.findElement(By.id("selenium_commands"));
        dropdow.findElement(By.xpath("//option[. = 'Browser Commands']")).click();
        
        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();



	}

}
