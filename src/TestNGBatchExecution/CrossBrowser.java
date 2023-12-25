package TestNGBatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
WebDriver driver;
	@Parameters("browser")
	@Test
	public void crossbrowser(String Browsername) {
		if(Browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.google.com/");
		}
		else
		{
			System.setProperty("webdriver.edge.driver","./selenium app/msedgedriver.exe");
			driver=new EdgeDriver();
			driver.get("https://www.google.com/");

		}
		driver.quit();
	}
}
