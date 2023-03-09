import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//assertFalse this will only accept false
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		
		//assertTrue this will only accept True
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		//Count the all checkbox prsent in the page
		System.out.print( driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		//find hiden checkbox
		System.out.print(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_VoucherDiscount']")).isEnabled());
	}

}
