//Open skillrary demo app and click on login using link text and click on forgot
//password using partial linktest
package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 
{
	public static void main(System[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("LOGIN")).click();
		driver.findElement(By.partialLinkText("Forgot")).click();

	}
}

