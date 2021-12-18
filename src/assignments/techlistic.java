package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class techlistic {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement fn = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
		fn.sendKeys("Nitish");
		WebElement ln = driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
		ln.sendKeys("Kumar");
		
		
		WebElement gen = driver.findElement(By.xpath("//input[@id=\"sex-0\"]"));
		gen.click();
		driver.findElement(By.xpath("//input[@id=\"profession-1\"])")).click();

		
	}

}
