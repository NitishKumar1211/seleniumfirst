package dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.id("cars"));
		Select s=new Select(ele);
		//s.selectByVisibleText("INR 100 - INR 199 ( 16 ) ");
		s.selectByValue("299");
		
		Thread.sleep(3000);
		
		//s.deselectByVisibleText("INR 100 - INR 199 ( 16 )");
		s.deselectByValue("299");
	

}
}
