import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		if(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected()==true)
		{
			driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		}
		
		//Count the all checkbox prsent in the page
		System.out.print( driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		//find hiden checkbox
		System.out.print(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_VoucherDiscount']")).isEnabled());
		
	}

}
