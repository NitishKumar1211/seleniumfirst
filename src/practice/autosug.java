package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosug {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		 WebElement ele = driver.findElement(By.xpath("//input[@class=\"desktop-searchBar\"]"));
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ele.sendKeys("Jacke");
		List<WebElement> ele1 = driver.findElements(By.xpath("//li[@class=\"desktop-suggestionTitle\"]"));
		System.out.println(ele1.size());
		for(WebElement a:ele1) 
		{
			System.out.println(a.getText());
		}
	}

}
