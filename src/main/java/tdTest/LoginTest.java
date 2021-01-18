package tdTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginTest {
         	static WebDriver driver;
		    public static void main(String[] args) throws InterruptedException {
     		launchBrowser();
	    	loginTest();
		    tearDown();
		}
		    public static void launchBrowser() {
			//set system property
			System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
			//create object of web driver
			driver = new ChromeDriver();
			//goto the web site
			driver.get("https://techfios.com/billing/?ng=admin/");
			//maximizes
			driver.manage().window().maximize();
		}
			public static void loginTest() {
			driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
			//identify the password box and pass it
			driver.findElement(By.id("password")).sendKeys("abc123");
			//identify sign in button and click
			driver.findElement(By.name("login")).click();
		}
		    public static void tearDown() throws InterruptedException {
			Thread.sleep(2000);
			driver.close();
}
}
