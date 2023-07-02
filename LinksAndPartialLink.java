package Com.SeleniumWebdriver_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksAndPartialLink {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\abhi1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(2000);
		//driver.close();	
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("password?")).click();
		System.out.println("title of page2 is: " + driver.getTitle());
		Thread.sleep(2000);
		driver.close();	
		
	}

}
