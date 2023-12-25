package ActionClass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTY {

	@Test
	public void TestYantraTS()
	{
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.google.com/");
		String exptitle="Google";
		String ActTitle=driver.getTitle();
		assertEquals(exptitle, ActTitle);
		System.out.println("test case is passed");
	}

}
