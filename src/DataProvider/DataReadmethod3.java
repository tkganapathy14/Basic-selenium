package DataProvider;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataReadmethod3{// without inheritance we read the data from another class
	
	
	@Test(dataProvider = "login",dataProviderClass = Dataprovider3.class)//when multi dataprovider using that time we should give name of provider
	public void Orange(String username,String password ) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.cssSelector("button[type=\"submit\"]")).submit();
		Thread.sleep(3000);
		Assert.assertEquals("OrangeHRM", driver.getTitle());
		driver.quit();
	}
}
