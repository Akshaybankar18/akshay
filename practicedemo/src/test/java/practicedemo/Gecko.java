package practicedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Gecko {

	public Gecko() {
		
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
ChromeOptions options = new ChromeOptions();
options.addArguments("--remote-allow-origins=*");

ChromeDriver driver = new ChromeDriver(options);
driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.8.1");
		
	}

}
