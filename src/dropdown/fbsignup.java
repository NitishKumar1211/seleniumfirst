//FB, Click on create New Account, Select the values from the dropdown
//get the count , PRINT the text, Print the text in ALPHA order
package dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbsignup 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.id("month"));
		
		ArrayList a = new ArrayList<>();
		
		Select s=new Select(ele);
		s.selectByIndex(5);
	//	s.selectByVisibleText("May");
		
		List<WebElement> options = s.getOptions();
		System.out.println(options.size());
		
		for(WebElement b:options)
		{
			String text = b.getText();
			a.add(text);
			System.out.println(text);
		}
		System.out.println("***********after sorting***************");
		
		Collections.sort(a);
		for( Object j:a)
		{
			System.out.println(j);
		}
	//	driver.close();
		
	
}
}