import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Explicit_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://broadpeak.webhr.co/hr/login/");
		driver.findElement(By.xpath("//input[@id='u']")).sendKeys("220054");
		driver.findElement(By.id("p")).sendKeys("Cloud{{}}0321");
		driver.findElement(By.xpath("//span[1]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[normalize-space()='My Alerts']")));
		
		String abc = driver.findElement(By.xpath("//div[normalize-space()='My Alerts']")).getText();
		
		System.out.println(abc);
		Assert.assertEquals(abc, "My Alerts");
	}

}
