package webelement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
//text field location of amazon
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test4 {
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		Point loc = ele.getLocation();
		int x = loc.getX();
		System.out.println("x cordinate ="+x);
		int y = loc.getY();
		System.out.println("y cordinate="+y);
		driver.close();
	
	}
}
