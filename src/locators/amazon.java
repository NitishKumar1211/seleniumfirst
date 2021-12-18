package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fie%3DUTF8%26ext_vrnc%3Dhi%26tag%3Dgooghydrabk-21%26ascsubtag%3D_k_CjwKCAjwo4mIBhBsEiwAKgzXOLHCiTqDoPSZxx5Nf_RI2mRIozU7jUZCXHw8L7qHQqwLbAEhHSRDYxoCKYcQAvD_BwE_k_%26ext_vrnc%3Dhi%26gclid%3DCjwKCAjwo4mIBhBsEiwAKgzXOLHCiTqDoPSZxx5Nf_RI2mRIozU7jUZCXHw8L7qHQqwLbAEhHSRDYxoCKYcQAvD_BwE%26ref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("9945733157");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("amazonnit@12");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Amazon Sign In"))
				{
			System.out.println("pass");
				}
		else
		{
			System.out.println("fail");
		}
		}
		
	}


