package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test0 {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("./Data.properties");
		p.load(fis);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(p.getProperty("Url"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys(p.getProperty("Username"));
		driver.findElement(By.name("pwd")).sendKeys(p.getProperty("Password"));
		
		
		

	}

}
