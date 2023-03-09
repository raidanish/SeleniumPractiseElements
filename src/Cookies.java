import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//It will delete all the cookies
		driver.manage().deleteAllCookies();
		
		//It will delete single cookie
		driver.manage().deleteCookieNamed("Single cokie");
		
		driver.get("http://www.google.com");
		
	}

}
