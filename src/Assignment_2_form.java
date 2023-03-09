import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment_2_form {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		try {
			
			driver.findElement(By.xpath("//div[@class='form-group']//input[@name='name']")).sendKeys("Danish");
			
			driver.findElement(By.xpath("//div[@class='form-group']//input[@name='email']")).sendKeys("test@gmail.com");
			
			driver.findElement(By.id("exampleInputPassword1")).sendKeys("admin123");
			
			driver.findElement(By.id("exampleCheck1")).click();
			
			WebElement options = driver.findElement(By.id("exampleFormControlSelect1"));
			
			Select option = new Select(options);
			
			 option.selectByIndex(1);
			 
			 driver.findElement(By.id("inlineRadio2")).click();
			 
			 driver.findElement(By.cssSelector("input[name='bday']")).click();
			 
			 driver.findElement(By.cssSelector("input[type='submit']")).click();
			 
			 Thread.sleep(1000);
			 
			 Assert.assertTrue(driver.findElement(By.xpath("//div[@class=\"alert alert-success alert-dismissible\"][1]")).getText().contains("Success! The Form has been submitted successfully"));
			
		} finally {
			Thread.sleep(2000);
			driver.quit();
		}
		
	}

}
