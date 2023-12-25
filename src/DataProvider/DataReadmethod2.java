package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataReadmethod2 {
	
	@DataProvider(name = "login", indices = {0,2})// if use like this we will read data of 0th row and 0th column
	public String[][] dataprovider()				// it will read 2 data
	{
		String data [][]=new String[3][2];
		data[0][0]="Admin";
		data[0][1]="admin123";
		data[1][0]="Admin";
		data[1][1]="admin321";
		data[2][0]="Admin";
		data[2][1]="ganapathy";
		
		return data;
	}
	
	@Test(dataProvider = "login")//when multi dataprovider using that time we should give name of provider
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
		driver.quit();
	}
}
