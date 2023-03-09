import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Only calcuting all links in the page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//Print total links from the footer section		
		WebElement footerDriver =  driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		//Print all link in the only first coulmn
		WebElement columnDriver =  footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());		
		
		//Click on each link and check if the links are working or not		
		for(int i=1; i<columnDriver.findElements(By.tagName("a")).size() ; i++)
		{
			//Press control + enter button
			String clickingLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickingLinkTab); // Passing valueing to links			
		}
		

		Set<String> tabs = driver.getWindowHandles(); // This will give 4 tabs
		Iterator<String> it = tabs.iterator(); // This will itrate all tabs
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		
	}

}
