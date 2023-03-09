import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println("Number of rows: "+ driver.findElements(By.cssSelector(".table-display tr")).size());
		System.out.println("Number of Column: "+ driver.findElements(By.cssSelector(".table-display th")).size());
		
		//System.out.println( driver.findElements(By.cssSelector(".table-display tr")).size());
		List<WebElement> list =  driver.findElements(By.cssSelector(".table-display tr"));
		
		for(int i =0 ; i<list.size();i++) {
			
			if(list.get(i).getText().contains("Learn SQL in Practical + Database Testing from Scratch"))
			{
				System.out.println(list.get(i).getText());
			}
		}
	}

}
