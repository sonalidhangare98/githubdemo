package TestClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import PomClass.ZerodhaPomClass;

public class BaseClass{

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(3000);

		WebElement Username=driver.findElement(By.xpath("//input[@label='User ID']"));
		
		Username.sendKeys("DV1510");
		
		WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
		
		Password.sendKeys("Goal@123");
		
		WebElement Loginbtn=driver.findElement(By.xpath("//button[@type='submit']"));
		
		Loginbtn.click();
		


	
		
	}

}
