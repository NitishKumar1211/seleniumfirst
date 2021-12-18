package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class luxirelogin 
{
		public static void main(String[] args)
		{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://luxire.com/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	Actions a=new Actions(driver);
	WebElement ele = driver.findElement(By.xpath("//a[text()='Account']"));
	a.moveToElement(ele).perform();
	
	driver.findElement(By.xpath("customer_login_link")).click();
	driver.findElement(By.id("CustomerEmail")).sendKeys("kumarnitish087@gmail.com");
	

	}
}

