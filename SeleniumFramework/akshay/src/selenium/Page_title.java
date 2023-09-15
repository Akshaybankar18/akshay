package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Page_title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    
	    driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
	    driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.print(title);
	    driver.close();
	    	
	    }

}
