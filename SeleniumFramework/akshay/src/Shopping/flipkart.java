package Shopping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class flipkart {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        
		WebDriver driver = new ChromeDriver(options);
	    driver.get("https://www.flipkart.com/travel/flights?otracker=nmenu_Flights");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div[1]/div/div[2]/div[1]/div[2]/form/div/div[1]/div[1]/div[1]/div[1]/input")).sendKeys("Pune");
	    driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div[1]/div/div[2]/div[1]/div[2]/form/div/div[1]/div[3]/div[1]/div[1]/input")).sendKeys("mumbai");
	    
	    driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div[1]/div/div[2]/div[1]/div[2]/form/div/div[2]/div[2]/div/input")).click();
	    while (true) {
	    String month = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div[1]/div/div[2]/div[1]/div[2]/form/div/div[3]/div[1]/div[2]/div/div/div/div/table[2]/thead/tr[1]/th[2]/div")).getText();
	    String year = driver.findElement(By.xpath("//span[@class= 'ui-datepicker-year']")).getText();
    
        if (year.equals("2090")&& month.equals("May")) {
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[7]/a")).click();
        break;
            }
        else {
        driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();	 
	    
	    
	}
	
	
}
}
}