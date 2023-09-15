package Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chrome.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		
		WebElement ddown = driver.findElement(By.name("birthday_year"));
		
		Select select = new Select(ddown);	
		select.selectByValue("2000");
		
		WebElement ddown1 = driver.findElement(By.name("birthday_month"));
		
		Select select1 = new Select(ddown1);	
		select1.selectByValue("1");
		
	}
	

}
