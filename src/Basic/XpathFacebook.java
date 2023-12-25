package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/login/");
driver.manage().window().maximize();
driver.findElement(By.id("email")).sendKeys("7207792375");
driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("16011997");
driver.findElement(By.id("loginbutton")).click();

	}

}
