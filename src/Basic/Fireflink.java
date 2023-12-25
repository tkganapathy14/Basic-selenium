package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fireflink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://app.fireflink.com/");
	driver.findElement(By.name("emailId")).sendKeys("tkganapathy16@gmail.com");
	driver.findElement(By.name("password")).sendKeys("Password@123");
	driver.findElement(By.className("primary-btn")).click();
	}

}
