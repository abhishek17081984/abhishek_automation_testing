package Com.SeleniumWebdriver_Assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elepopup12 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\abhi1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/popup.php");
		
		//driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		String main_w=driver.getWindowHandle();
		System.out.println("main windows is.."+main_w);
		
		driver.findElement(By.partialLinkText("Click Here")).click();
		Thread.sleep(2000);
		
		Set<String> all_w=driver.getWindowHandles();
	    Iterator<String> i1=all_w.iterator();
	    
	    while (i1.hasNext()) {
			String chlid_w=i1.next();
			System.out.println(chlid_w);
			
			
			if (!main_w.equals(chlid_w)) {
				driver.switchTo().window(chlid_w);
				Thread.sleep(2000);
				driver.findElement(By.name("emailid")).sendKeys("abhisheksonar53@gmail.com");
				Thread.sleep(2000);
				
				//driver.findElement(By.id("sign-password")).sendKeys("abhisheksonar");
				//Thread.sleep(2000);
				
				driver.findElement(By.name("btnLogin")).click();
				Thread.sleep(2000);
				driver.close();
				
				
			}
			
		}	
	    
	    driver.switchTo().window(main_w);
	    System.out.println("main windows title is ...."+main_w);
	    Thread.sleep(2000);
	    driver.close();
		
	}


}
