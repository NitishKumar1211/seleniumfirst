//Open Browzer, Enter skillrary.com, mousehover on the courses, select selenium training.
//click on add to cart, click on cancel.

package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.id("course"));
		
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[text()=\"Selenium Training\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary btn-lg btn-flat\"]")).click();
		
		Alert b = driver.switchTo().alert();
		b.dismiss();
		
		driver.close();
		
		
		

	}

}
