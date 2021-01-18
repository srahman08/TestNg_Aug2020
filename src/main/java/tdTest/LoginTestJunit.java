package tdTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestJunit {

	 WebDriver driver;
	 @Before
	 			public  void launchBrowser() {
				System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.get("https://techfios.com/billing/?ng=admin/");
				driver.manage().window().maximize();
			}
	   			@Test
				public  void loginTest() {
				driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
				driver.findElement(By.id("password")).sendKeys("abc123");
				driver.findElement(By.name("login")).click();
			}
	   			@After
			    public  void tearDown() throws InterruptedException {
				Thread.sleep(2000);
				driver.close();
	}
	
	
}
