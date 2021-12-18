package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;

public class flipkartss 
{
public static void main(String[] args) throws IOException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();

	driver.navigate().to("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//Typecasting
    TakesScreenshot ts=(TakesScreenshot) driver;
    
    //acces the method and store it in ram
     File src = ts.getScreenshotAs(OutputType.FILE);
     
     //Specify the location
     File dest=new File("./Photo/flipkart.png");
     
     FileUtils.copyFile(src, dest);
     
     driver.close();
     	
}
}
