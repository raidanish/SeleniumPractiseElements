import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/hovers");
		
		Actions a = new Actions(driver);
		
		WebElement hoverElement = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[1]"));
		
		a.moveToElement(hoverElement).build().perform();
		
	}

}
