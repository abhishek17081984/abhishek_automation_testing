package Com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameterized_FacebookLogin {
	WebDriver driver=null;
	@Test
	@Parameters({"url","email","pass"})
	
	public void FacebookLoging(String url,String email,String pass) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\abhi1\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("email")).sendKeys(email);
		Thread.sleep(2000);
		
		driver.findElement(By.id("pass")).sendKeys(pass);
		Thread.sleep(2000);
		
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		
		driver.close();
		
		
		
	}

}
