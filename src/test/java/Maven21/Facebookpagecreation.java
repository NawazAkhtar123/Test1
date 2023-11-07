package Maven21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebookpagecreation {

static WebDriver driver;	
	
@Test

public static void creationpage(ITestContext context) throws InterruptedException {
driver = new ChromeDriver();
driver.get("https://www.facebook.com");
Thread.sleep(2000);
}
@Test(dependsOnMethods="creationpage")
public static void createaccountbutton(ITestContext context)throws InterruptedException {
driver.switchTo().newWindow(WindowType.TAB);
driver.findElement(By.xpath("(//a)[3]")).click();
Thread.sleep(2000);
}
@Test(dependsOnMethods="creationpage")
public static void Enterusername (ITestContext context)throws InterruptedException {
driver.switchTo().newWindow(WindowType.TAB);
driver.findElement(By.xpath("(//a)[3]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Nawaz");
Thread.sleep(3000);
}
@Test (dependsOnMethods="creationpage")
public static void Enterlastname (ITestContext context)throws InterruptedException {
driver.switchTo().newWindow(WindowType.TAB);
driver.findElement(By.xpath("(//a) [3]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Nawaz");
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Akhtar");
Thread.sleep(3000);
}
@Test(dependsOnMethods="creationpage")
public static void Registeremailid(ITestContext context)throws InterruptedException {
driver.switchTo().newWindow(WindowType.TAB);
driver.findElement(By.xpath("(//a) [3]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Nawaz");
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Akhtar");
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("nawazakhtar1@gmail.com");
Thread.sleep(3000);
}
}