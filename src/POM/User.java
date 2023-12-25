package POM;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class User {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		
		LoginPage login=new LoginPage(driver);
		login.getElement().click();
		Thread.sleep(4000);
		login.getElement1().sendKeys("tkganapathy16@gmail.com");
		Thread.sleep(2000);
		login.getElement2().sendKeys("123456");
		Thread.sleep(2000);
		login.getElement3().click();
		Thread.sleep(2000);
		driver.quit();
	}

}
