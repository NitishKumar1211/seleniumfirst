package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class netflix {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/");
		driver.findElement(By.linkText("Sign In")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Email or phone number')]")).sendKeys("kumarnitish087@gmail.com");
		driver.findElement(By.xpath("//label[contains(text(),'Password')]")).sendKeys("Netflixnit@12");
		driver.findElement(By.linkText("Sign In")).click();
		
		String title=driver.getTitle();
		System.out.println(title);
		
	}

}
