import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		//Get Windows ID		
		Set<String> windows = driver.getWindowHandles(); //[ParentID, ChildID]		
		Iterator<String> it = windows.iterator();
		String ParentID = it.next(); // It will return Parent index
		String ChildID = it.next(); // It will return child Index
				
		driver.switchTo().window(ChildID); // Giving index value to driver
		
		System.out.print( driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0]);
		
		//Again switching back to parentID
		driver.switchTo().window(ParentID);

		driver.findElement(By.id("username")).sendKeys("emailId");
		
		
	}

}
