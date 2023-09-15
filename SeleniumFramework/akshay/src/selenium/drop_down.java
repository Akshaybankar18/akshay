package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class drop_down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        
		WebDriver driver = new ChromeDriver(options);
		
		// method 1
	    driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		
		
	    driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input")).click();
		driver.findElement(By.xpath("//*[@id=\"pr_id_1_list\"]/li[43]/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"destination\"]/span/input")).click();
		
		driver.findElement(By.xpath("//*[@id=\"pr_id_2_list\"]/li[5]/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"journeyQuota\"]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"journeyQuota\"]/div/div[4]/div/ul/p-dropdownitem[5]/li")).click(); 
		
		
		// method 2
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		
		driver.findElement(By.xpath("//*[@id=\"field0\"]/div/input")).sendKeys("akshay@gmail.com");
		
		WebElement ddown=driver.findElement(By.xpath("//*[@id=\"field26\"]/div/select"));
		
		Select select = new Select (ddown);
		select.selectByValue("level1");
		

	}

}
