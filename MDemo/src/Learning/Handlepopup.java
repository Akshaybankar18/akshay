package Learning;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlepopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("Webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32\\chrome.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	
	//	String text = driver.findElement(By.cssSelector("z")).getText();
		
		System.out.println();
	}
}
