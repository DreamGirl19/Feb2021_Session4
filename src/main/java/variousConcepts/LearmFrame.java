package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearmFrame {
	
	
	WebDriver driver;

	@Before
	public void init() {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://docs.oracle.com/javase/8/docs/api");
		
	
	}

	@Test
	public void dealWithFrame() {
		
		driver.switchTo().frame("pacakeListFrame");
		driver.findElement(By.linkText("java.awt.color")).click();
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("ColorSpace")).click();
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame("classFrame");
		System.out.println(driver.getTitle());
		
	}
	
}
