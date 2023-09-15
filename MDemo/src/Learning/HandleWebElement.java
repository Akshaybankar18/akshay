package Learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebElement {

	private static final char[] Break = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("Webelement.chrom ne.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32.exe");
    
    WebDriver driver = new ChromeDriver();
    
    driver.get("https://www.w3schools.com/html/html_tables.asp");
    
  //driver.manage().window().maximize();
    
  //*[@id="customers"]/tbody/tr[2]/td[1]
  //*[@id="customers"]/tbody/tr[3]/td[1]
  //*[@id="customers"]/tbody/tr[4]/td[1]
  //*[@id="customers"]/tbody/tr[7]/td[1]
    
   List<WebElement> rows = driver.findElements(By.xpath("((//table[@id='customers']/tbody/tr))"));
   int rowCount = rows.size(); 
	  System.out.println("Total rows in web table : " + rowCount);
    
    String beforeXpath = " //*[@id=\'customers\']/tbody/tr[";
    String afterXpath = "]/td[1]";
    
    for(int i=2; i<=7; i++) {
    	
    String ActualXpath = beforeXpath+i+afterXpath;
    
    WebElement element = driver.findElement(By.xpath(ActualXpath));
    
    System.out.println(element.getText());
   
    if(element.getText().equals("Island Trading")){
   
    System.out.println("Company name" + " is found" + " "+ element.getText() + " at position " + (i-1));
   
    break;
    }
	}
    System.out.println("+++++");
   
  //*[@id="customers"]/tbody/tr[2]/td[2]
    String afterXpathContact = "]/td[2]"; 
    
    for(int i=2; i<=7; i++) {
    	
    String ActualXpath = beforeXpath+i+afterXpathContact;
        
    WebElement element = driver.findElement(By.xpath(ActualXpath));
        
    System.out.println(element.getText());
       
    if(element.getText().equals("Island Trading")){
       
 System.out.println("Company name" + " is found" + " "+ element.getText() + " at position " + (i-1));
       
      break; }}
    
    System.out.println("----"); 
    
    
  //*[@id="customers"]/tbody/tr[2]/td[3]
    
    String afterXpathCountry = "]/td[3]";
    
    for(int i1=2; i1<=7; i1++) {
    	
        String ActualXpath1 = beforeXpath+i1+afterXpathCountry;
        
        WebElement element1 = driver.findElement(By.xpath(ActualXpath1));
        
        System.out.println(element1.getText());
        
    }     
         
        
        
        
        
        
        
           
            
    
   
        
        
    
    
}
}