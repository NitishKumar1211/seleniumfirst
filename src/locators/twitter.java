package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class twitter {

	public static void main(String[] args) throws InterruptedException 
	{ 
		WebDriver driver=new ChromeDriver();
		driver.get("https://twitter.com/login?lang=en");
		Thread.sleep(3000);
		driver.findElement(By.name("session[username_or_email]")).sendKeys("@12Nitish");
		driver.findElement(By.name("session[password]")).sendKeys("twitnit12");
		driver.findElement(By.xpath("//span[text()='Log in'][1]")).click();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		if(title.equals("Twitter"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		
		driver.close();
		
	}
		
	
		
		
		
		
	}


