package popups;

		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

		
			public class calendarpopup {

			public static void main(String[] args) throws InterruptedException 
			{
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.get("https://demo.actitime.com/login.do");
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
				driver.findElement(By.name("username")).sendKeys("admin");
				driver.findElement(By.name("pwd")).sendKeys("manager");
				
				driver.findElement(By.xpath("//div[text()='Login ']")).click();
				driver.findElement(By.id("container_users")).click();
				driver.findElement(By.xpath("//div[text()='New User']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//td[@class=\"x-btn-right\"]")).click();
				driver.findElement(By.xpath("//span[text()=\"6\"]")).click();
				

	}

}
