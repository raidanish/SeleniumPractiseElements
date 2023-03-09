import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDownStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Dropdown with select tag
		
		WebElement staticDropdown =  driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown = new Select(staticDropdown);
		//Selecting by list index
		dropdown.selectByIndex(3);
		System.out.print( dropdown.getFirstSelectedOption().getText());
		
		//selecting by visible text
		dropdown.selectByVisibleText("AED");
		System.out.println( dropdown.getFirstSelectedOption().getText());
		
		//Selecting by values
		dropdown.selectByValue("INR");
		Assert.assertEquals(dropdown.getFirstSelectedOption().getText(), "INR");
	}

}
