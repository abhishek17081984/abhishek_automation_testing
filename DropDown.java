package Com.SeleniumWebdriver_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\abhi1\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://demo.guru99.com/test/newtours/register.php");
Thread.sleep(2000);
WebElement e1=driver.findElement(By.name("country"));
Select s1=new Select(e1);


for (int i = 0; i <7 ; i++) {
	s1.selectByIndex(i);
	Thread.sleep(2000);	
}
driver.close();
}

}
