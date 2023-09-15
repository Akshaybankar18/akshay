import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DEMO {

	public static void main(String[] args) {
		System.setProperty(null, null);
		WebDriver driver= new ChromeDriver();
		driver.switchTo().alert().accept();

	}

}
