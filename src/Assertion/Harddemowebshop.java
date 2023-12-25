package Assertion;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Harddemowebshop {

	@Test
	public void demowebshops() {
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		String Actual=driver.getTitle();
		String Expected="Demo Web Shop";
		assertEquals(Actual,Expected);
		System.out.println("Title is verified");
	
	
	}
}
