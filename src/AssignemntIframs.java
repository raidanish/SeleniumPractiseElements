import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignemntIframs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-top']")));
		
		//driver.switchTo().frame(2);
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-middle']")));
		System.out.print(driver.findElement(By.xpath("//div[@id='content']")).getText());
		
		//System.out.print(driver.findElements(By.tagName("frame")).size());
		
		
	}

}
