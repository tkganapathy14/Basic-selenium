package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
//driver.get("file:///C:/Users/tkgan/OneDrive/Desktop/demowegpage.html");
//driver.findElement(By.cssSelector("input [id='username']")).sendKeys("Ganapathy");
//driver.findElement(By.cssSelector("input[name='password']")).sendKeys("7207792375");
//driver.findElement(By.cssSelector("input [placeholder='confirm']")).sendKeys("7207792375");
driver.get("https://app.fireflink.com/");

driver.findElement(By.cssSelector("input[name='emailId']")).sendKeys("tkganapathy16@gmail.com");
driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Password@123");
driver.findElement(By.cssSelector("input[className='primary-btn']")).click();
	}

}
