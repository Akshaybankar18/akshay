package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Base.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstTest extends BaseClass {
	
	@Test

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/?ref_=icp_country_from_us");
	    driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	    driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span")).click();
	    driver.findElement(By.id("ap_email")).sendKeys("mansi1912k@gmail.com");
	    driver.findElement(By.id("//*[@id=\"continue\"]")).click();
	    driver.findElement(By.id("ap_password")).sendKeys("Mansi@1912"); 
	    driver.findElement(By.id("signInSubmit")).click();
	    driver.findElement(By.id("account-fixup-phone-number")).sendKeys("8087273237");
	}
	

}
