package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorFB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
driver.findElement(By.cssSelector("input[id='email']")).sendKeys("7207792375");
driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("16011997");
driver.findElement(By.cssSelector("button[name='login']")).click();
	}

}
