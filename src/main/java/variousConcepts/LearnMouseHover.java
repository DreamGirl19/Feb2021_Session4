package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseHover {
	
	WebDriver driver;
	private Actions action;

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
	public void mouseHover() {
		
		driver.findElement(By.xpath("//*[@id=\"l1\"]"));
		driver.findElement(By.xpath("//*[@id=\"l1_6\"]/span"));
		driver.findElement(By.xpath("//*[@id=\"dell-masthead\"]/div"));
		
		
	 new Actions(driver);

	action.moveToElement((WebElement) By.xpath("//*[@id=\\\"l1\"]")).build().perform();
	action.moveToElement((WebElement) By.xpath("//*[@id=\\\"l1_6\\\"]/span")).build().perform();
	//action.moveToElement((WebElement) By.xpath("\"//*[@id=\\\"dell-masthead\\\"]/div")).build().perform();
	((WebElement) driver).click();

			
	}
	

}
