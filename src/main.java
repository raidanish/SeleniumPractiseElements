import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriver driver = new ChromeDriver();
		
		//FirFox
		/*WebDriver driver = new FirefoxDriver();
		
		driver.get("https://edible-qa.naranga.com/signin.aspx");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.wait();
		driver.quit();*/
		
		/*ChromeOptions chromeOptions = new ChromeOptions();
	    chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
	    WebDriver driver = new ChromeDriver(chromeOptions);
	    try {
	      // Navigate to Url
	      driver.get("https://google.com");
	    } finally {
	      driver.quit();
	    }
		  }*/
		/*WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/ncr");
		driver.findElement(By.name("q")).sendKeys("cheese" + Keys.ENTER);
		// Initialize and wait till element(link) became clickable - timeout in 10 seconds
		WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(0))
		        .until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));
		// Print the first result
		System.out.println(firstResult.getText());*/
		
		for (int i = 0; i < 10; i++)
		{
		      if (i == 4) 
		      {
		        break;
		      }      
		     System.out.println(i);
		}
	}
}


