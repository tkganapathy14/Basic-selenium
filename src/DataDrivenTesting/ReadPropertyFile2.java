package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropertyFile2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		FileInputStream fis=new FileInputStream("./Test data DDT/data.properties");
		Properties property = new Properties();
		property.load(fis);
		driver.get(property.getProperty("url"));
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys(property.getProperty("gmail"));
		driver.findElement(By.id("Password")).sendKeys(property.getProperty("mobile"));
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		driver.quit();
		
		
		String value = property.getProperty("url");
		System.out.println(value);
		System.out.println(property.getProperty("un"));
		System.out.println(property.getProperty("pwd"));
		System.out.println(property.getProperty("mobile"));
		System.out.println(property.getProperty("gmail"));
	}

}
