package Com.SeleniumWebdriver_Assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alert12 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\abhi1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	
		driver.findElement(By.name("cusid")).sendKeys("123");
		Thread.sleep(2000);

		
		
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		
		Alert a1=driver.switchTo().alert();
		System.out.println("first alert message"+a1.getText());
		a1.accept();
		//a1.dismiss();
		
		Thread.sleep(2000);
		
		Alert a2Alert=driver.switchTo().alert();
		System.out.println("second alert message: "+a2Alert.getText());
		a2Alert.accept();
	Thread.sleep(2000);
	
		driver.close();
		
	}

	

	
	}
	

