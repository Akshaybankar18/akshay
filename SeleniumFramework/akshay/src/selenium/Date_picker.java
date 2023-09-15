package selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Date_picker {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        
		WebDriver driver = new ChromeDriver(options);
	    driver.get("https://demo.automationtesting.in/Datepicker.html");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).click();
	    while (true) {
	    String month = driver.findElement(By.xpath("//span[@class= 'ui-datepicker-month']")).getText();
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
