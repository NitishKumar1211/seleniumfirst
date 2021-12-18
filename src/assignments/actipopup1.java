package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actipopup1 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/administration/userlist.do");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[text()='New User']")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.name("firstName")).sendKeys("Nitish");
		WebElement ele = driver.findElement(By.xpath("//div[@class=\"closeButton hideButton_panelContainer\"]"));
		ele.click();
		String text = ele.getText();
		System.out.println(text);
		
		Alert y = driver.switchTo().alert();
		y.accept();
		
	
	}

}
