import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollingConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Declear JS object and cast driver to JS
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//It will scroll web page
		js.executeScript("window.scroll(0,900)");
		
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
		
		List<WebElement> values =   driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		int sum =0;
		
		for(int i=0; i<values.size(); i++)
		{
			sum  = sum + Integer.parseInt(values.get(i).getText());
		}
		
		System.out.println("Total: Amount:" + sum);
		
		int TotalNUmber = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		
		Assert.assertEquals(sum, TotalNUmber);
	}

}
