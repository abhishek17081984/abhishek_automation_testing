package Com.SeleniumWebdriver_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailRegister {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\abhi1\\chromedriver_win32\\chromedriver.exe");
				
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-1073256395%3A1686401799848243&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&ffgf=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=Af_xneEX5Od-ku0jPajtTGtqimmUPeb9rFOYUt5adT3wXNbBX_d5BrzKHLKXEswIAQBNHCp_Pclvcg&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		Thread.sleep(2000);


		driver.findElement(By.id("identifierId")).sendKeys("abhisheksonar53@gmail.com");
		Thread.sleep(2000);


		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")).click();
		Thread.sleep(2000);



		//driver.close();
		}

}
