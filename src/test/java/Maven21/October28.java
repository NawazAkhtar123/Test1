package Maven21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

	public class October28 {

	@Test
		
	public static void Loginpage() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	Thread.sleep(3000);
	driver.navigate().back();
	driver.get("https://www.github.com");
	Thread.sleep(3000);
	driver.navigate().back();
	driver.get("https://www.twitter.com");
	Thread.sleep(3000);
	driver.navigate().refresh();
	
	}

	}

