package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prac1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

//		String ele = driver.getTitle();
//		System.out.println(ele);
//		if(driver.getTitle().equals(ele))
//				{
//					System.out.println("Pass");
//				}
//		else
//		{
//			System.out.println("fail");
//		}
//	}

 JavascriptExecutor js=(JavascriptExecutor)driver;
 js.executeScript("window.scrollBy(0,6000)");
 driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]")).click();
 js.executeScript("window.scrollBy(0,-6000)");
 driver.findElement(By.xpath("//span[@class=\"shopping_cart_badge\"]")).click();
 driver.findElement(By.id("checkout")).click();
 driver.findElement(By.id("first-name")).sendKeys("Nitish");
 driver.findElement(By.id("last-name")).sendKeys("Kumar");
 driver.findElement(By.name("postalCode")).sendKeys("456465");
 
 driver.findElement(By.name("continue")).click();
 driver.findElement(By.name("finish")).click();
 
 
 
}
}
