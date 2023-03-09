import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Topic Window maximize
		//
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://google.com");
		
		driver.navigate().to("https://rahulshettyacademy.com/");
		
		driver.navigate().back();
		driver.navigate().forward();
	}

}
