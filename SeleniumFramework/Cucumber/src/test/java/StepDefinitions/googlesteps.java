package StepDefinitions;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class googlesteps {
    WebDriver driver = new ChromeDriver();
	
	@Given("browser is open")
	public void browser_is_open() {
	    System.out.println("browser is open");
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		 System.out.println("user is on google search page");
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}

	@When("user enters a text in box")
	public void user_enters_a_text_in_box() {
		 System.out.println("user enters a text in box");
	     driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Automation step by step");
	}

	@And("hits enter")
	public void hits_enter() {
		 System.out.println("hits enter");
		 driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		 System.out.println("user is navigated to search results");
		 driver.get("https://www.google.com/search?q=automation+step+by+step&rlz=1C1UEAD_enIN1036IN1036&oq=&gs_lcrp=EgZjaHJvbWUqCQgBEEUYOxjCAzIJCAAQRRg7GMIDMgkIARBFGDsYwgMyCQgCEEUYOxjCAzIJCAMQRRg7GMIDMgkIBBBFGDsYwgMyCQgFEEUYOxjCAzIJCAYQRRg7GMIDMgkIBxBFGDsYwgPSAQ81MzUzODk2NDIwajBqMTWoAgiwAgE&sourceid=chrome&ie=UTF-8");
		 driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/table/tbody/tr[2]/td/div/h3/a")).click();
		 driver.close();
		 driver.quit();
	}

}
