import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locattors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//imlicit wait - Setting wait property to driver instant
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Locator by ID attribute
		driver.findElement(By.id("inputUsername")).sendKeys("danish");
		//Locator Name attribute 
		driver.findElement(By.name("inputPassword")).sendKeys("admin123");
		//Locate by class name attribute
		driver.findElement(By.className("signInBtn")).click();
		
		// Css selector by tabname.class name		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		//Locator by link text
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//   Xpath  //
		//Locator using xPath
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("abc");
		
		//Locate by css 
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		//find attribute by its index
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("new email ID");
		
		//Locate by xPath parent to child concept
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("data");		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		////Locate by CSS parent to child concept
		driver.findElement(By.cssSelector("form p")).getText();
		
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");

		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

		driver.findElement(By.id("chkboxOne")).click();

		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
	}

}
