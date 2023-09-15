package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Mouse_handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        
		WebDriver driver = new ChromeDriver(options);
		 driver.get("https://www.ebay.com/");
         driver.manage().window().maximize();
         
         // 1) mouse hover
         WebElement element = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[7]/a"));
         Actions action = new Actions(driver);
         action.moveToElement(element).perform();
         Thread.sleep(3000);
         
         // 2) Right click
         WebElement element1 = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]"));
         action.contextClick(element1).perform();
         Thread.sleep(3000);
         
         // 3) Double click
         driver.get("https://demo.guru99.com/test/simple_context_menu.html");
         WebElement element2 = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
         action.doubleClick(element2).perform();
         
         
         
         
	}

}
