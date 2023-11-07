package Maven21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class Facbook1 {
	WebDriver driver;
	  String baseurl ="https://www.facebook.com/r.php?locale=en_GB&display=page";

	  
@Test(priority = 1,description ="This code launch Browser")
public void Urllaunch(ITestContext context) throws InterruptedException
{          
		   driver = new ChromeDriver();
		   driver.get(baseurl);
	       Thread.sleep(2000);
	      
}		
@Test(priority = 2,dependsOnMethods="Urllaunch",description ="This code Enter user name")	
public  void Enterusername(ITestContext context) throws InterruptedException
{ 
	    driver.switchTo().newWindow(WindowType.TAB);
	    driver.get(baseurl);
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Nawaz");
		Thread.sleep(2000);
		
}

@Test(priority = 3, dependsOnMethods="Urllaunch",description ="This code Enter last name")	
public  void EnterLastname(ITestContext context) throws InterruptedException
{ 
	    driver.switchTo().newWindow(WindowType.TAB);
		driver.get(baseurl);
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("Akhtar");
		Thread.sleep(2000);
	
		
}

@Test(priority = 4,dependsOnMethods="Urllaunch", description ="This code Enter all data")	
public  void Entermail(ITestContext context) throws InterruptedException
{ 
	    driver.switchTo().newWindow(WindowType.TAB);
	    driver.get(baseurl);
	    Thread.sleep(2000);		
		driver.findElement(By.name("reg_email__")).sendKeys("test123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Admin5");
		Thread.sleep(2000);
		
		WebElement dropdown1 = driver.findElement(By.name("birthday_day"));
		
		Select day = new Select(dropdown1);
		
		day.selectByIndex(5);
		
	   WebElement dropdown2 = driver.findElement(By.id("month"));
		
		Select month = new Select(dropdown2);
		
		month.selectByIndex(4);
		
		
	    WebElement dropdown3 = driver.findElement(By.id("year"));
		
		Select year = new Select(dropdown3);
		
		year.selectByIndex(8);
		
		driver.findElement(By.className("_58mt")).click();

}
}
