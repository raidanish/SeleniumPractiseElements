import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_ChildWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/windows");
		
		driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
		
		//Geting index
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		
		String ParentID = it.next(); // It will return Parent index
		String ChildID = it.next(); // It will return child Index
		
		driver.switchTo().window(ChildID);
		
		System.out.println("Child winodw text: " + driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		
		driver.switchTo().window(ParentID);
		
		System.out.println("Parent winodw text: " + driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		
				
		
	}

}
