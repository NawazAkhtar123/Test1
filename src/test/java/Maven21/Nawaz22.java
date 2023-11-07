package Maven21;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nawaz22 {

@Test
	
public static void Urllaunch() throws InterruptedException {
	
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	//WebDriverManager.firefoxdriver().setup();
	//WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//a) [3]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Nawaz");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Akhtar");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("nawazakhtar123@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("nawazakhtar123@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("nawaz@123");
	Thread.sleep(3000);
	WebElement dayDropDown=driver.findElement(By.xpath("//*[@name='birthday_day']"));
	Select day = new Select(dayDropDown);
	day.selectByIndex(0);
	Thread.sleep(2000);
	WebElement MonthDropDown=driver.findElement(By.xpath("//*[@name='birthday_month']"));
	Select month = new Select(MonthDropDown);
	month.selectByIndex(5);
	Thread.sleep(2000);
	WebElement YearDropDown=driver.findElement(By.xpath("//*[@name='birthday_year']"));
	Select Year = new Select(YearDropDown);
	Year.selectByIndex(2);
	
}
}