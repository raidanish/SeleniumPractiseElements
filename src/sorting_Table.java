import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class sorting_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//////////// Check Column is sorted or not //////////////////
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		//Capture all web element to the list
		List<WebElement> elementsList =  driver.findElements(By.xpath("//tr/td[1]"));
		
		//Streem concept
		//Capture text of all webElements into new(origial) list
		List<String> originalList =  elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//apple sorting on original list
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		
		Assert.assertTrue(originalList.equals(sortedList));
		//////////////////////////////////////////////////////////////////
		
		//Scan the name column with gettext ->Rice-> print the price of the Rice
		////////////////////////////////////////////////////////////////////////////
		
		//elementsList.stream().filter(s->.getText).map(s->getPriceVeggie()).collect)C.ollectors.toList());
	}

}
