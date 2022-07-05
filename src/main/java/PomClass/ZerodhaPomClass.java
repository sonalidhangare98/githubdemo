package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaPomClass {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@label='User ID']")
	private WebElement Username;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement Password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Login;
	
	public ZerodhaPomClass(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void Username()
	{
		Username.sendKeys("DV1510");
	}
	
	public void Password()
	{
		Password.sendKeys("Goal@123");
	}
	
	public void clickButton()
	{
		Login.click();
	}
	
	

}
