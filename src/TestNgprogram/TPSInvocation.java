package TestNgprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TPSInvocation {

	@Test(invocationCount =3,threadPoolSize = 3)
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		Thread.sleep(2000);
		driver.quit();
	}

}
