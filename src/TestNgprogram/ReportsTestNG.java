package TestNgprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportsTestNG {
	@Test
	public void NavigateAmazon() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Reporter.log("browser launched",true);
		driver.manage().window().maximize();
		Reporter.log("browser is maximized",true);
		driver.get("https://www.amazon.in/");
		Reporter.log("browser navigate to Amazon",true);
		Thread.sleep(4000);
		driver.quit();
		Reporter.log("browser is closed",true);
		
	}
}
