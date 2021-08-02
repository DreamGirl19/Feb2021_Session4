package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseScrollDown {
		
		WebDriver driver;

		@Before
		public void init() {

			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			driver.get("https://www.dell.com/en-us");
			
		}
		
		@Test
		public void loginTest() {
			
			Actions action = new Actions(driver);
			action.sendKeys(Keys.ENTER).build().perform();
		
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("scroll(0,5000)");
			
			
		}
		
	}


