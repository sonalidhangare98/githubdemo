package TestClass;

import org.openqa.selenium.WebDriver;

import PomClass.ZerodhaPomClass;

public class TestClass  {
	
	WebDriver driver;

	public void LoginTest()
	{

		ZerodhaPomClass pc=new ZerodhaPomClass(driver);
		pc.Username();
		pc.Password();
		pc.clickButton();
		
	}

}
