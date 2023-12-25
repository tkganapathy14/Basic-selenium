package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instademologin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//input[@class=\"_aa4b _add6 _ac4d\"]")).sendKeys("7207792375");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Ganapathy@97");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
	}

}
