package Maven21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class Orangehrm {
	WebDriver driver;
	String baseurl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	@Test
	public void Forlaunchlrl (ITestContext context) throws InterruptedException 
	{
		   driver = new ChromeDriver();
		   driver.get(baseurl);
		   driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	       driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	       
		   driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		 
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			driver.findElement(By.xpath("//a[contains(@href,'AdminModule')]")).click();
//			
//			driver.findElement(By.xpath("//i[contains(@class,'oxd-button-icon')]")).click();
//			
//			driver.findElement(By.xpath("//*[contains(text(),'User Role')]//following::div[4]")).sendKeys(Keys.DOWN,Keys.ENTER);
//			
//			driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("paul");
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("//*[contains(text(),'Employee Name')]//following::input")).sendKeys(Keys.DOWN, Keys.ENTER);
//		
//			driver.findElement(By.xpath("//*[contains(text(),'Status')]//following::div[4]")).sendKeys(Keys.DOWN,Keys.ENTER);
//			
//			driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("Nawaz31");
//			
//			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
//			
//			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")).sendKeys("admin123");
//		
//			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			//driver.findElement(By.xpath("//*[contains(text(),'test1')]//following::div//i[@class='oxd-icon bi-trash']")).click();
			//driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]")).click();
			
			driver.findElement(By.xpath("//i[contains(@class,'oxd-icon bi-caret-down-fill oxd-userdropdown-icon')]")).click();
			driver.findElement(By.xpath("//a[contains(@href,'/web/index.php/auth/logout')]")).click();
		}

	}
