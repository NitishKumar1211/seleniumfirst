package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actitime {
	@FindBy(xpath="//input[@class=\"textField\"]")
	private WebElement usernametb;
	
	@FindBy(name="pwd")
	private WebElement passwordtb;
	
	
	@FindBy(xpath="//div[contains(text(),'Login ')]")
	private WebElement loginbtn;
	
	public actitime(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	public void username(String us) 
	{
		usernametb.sendKeys(us);
	}
	public void password(String pw) 
	{
		passwordtb.sendKeys(pw);

	}
	public void login()
	{
		loginbtn.click();
	
	}
	

}
