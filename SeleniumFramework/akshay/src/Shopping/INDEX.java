package Shopping;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class INDEX {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://login.yahoo.com/account/create?specId=yidReg&altreg=0&intl=in&.done=http://in.mail.yahoo.com");
				driver.findElement(By.xpath("//*[@id=\"usernamereg-firstName\"]")).sendKeys("Vengat");
				driver.findElement(By.xpath("//*[@id=\"usernamereg-lastName\"]")).sendKeys("Ram");
				driver.findElement(By.xpath("//*[@id=\"usernamereg-userId\"]")).sendKeys("vengat12344444");
				driver.findElement(By.xpath("//*[@id=\"usernamereg-password\"]")).sendKeys("venkat12345");
				WebElement w =driver.findElement(By.xpath("//*[@id=\"usernamereg-month\"]"));
				Select s=new Select(w);
				s.selectByValue("11");
				driver.findElement(By.xpath("//*[@id=\"usernamereg-day\"]")).sendKeys("16");
				driver.findElement(By.xpath("//*[@id=\"usernamereg-year\"]")).sendKeys("1993");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"reg-submit-button\"]")).click();


	}

}
