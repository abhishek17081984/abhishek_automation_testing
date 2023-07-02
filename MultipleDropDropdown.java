package Com.SeleniumWebdriver_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\abhi1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");

		Select select=new Select(driver.findElement(By.id("fruits")));
		Thread.sleep(2000);

		select.selectByValue("banana");
		Thread.sleep(2000);


		select.selectByIndex(2);
		Thread.sleep(2000);


		select.selectByVisibleText("Grape");
		Thread.sleep(2000);

		select.deselectAll();
		Thread.sleep(2000);

		for (int i =0; i <4; i++) {
		select.selectByIndex(i);
		Thread.sleep(2000);
		}
		driver.close();
		}


}
