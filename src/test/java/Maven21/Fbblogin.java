package Maven21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Fbblogin {

	@Test
	
	public static void submit() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("akhtarnawaz01031997@gmail.com");
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Nawaz@2023");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
}
}
