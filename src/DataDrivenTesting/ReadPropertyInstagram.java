package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ReadPropertyInstagram {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./AutoIT/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		FileInputStream fis=new FileInputStream("./Test data DDT/Instagramdata2.properties");
		Properties properties=new Properties();
		properties.load(fis);
		Thread.sleep(4000);
		driver.get(properties.getProperty("url"));
		Thread.sleep(4000);
		WebElement email = driver.findElement(By.xpath("//input[@class=\"_aa4b _add6 _ac4d\"]"));
		WebElement pword = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		JavascriptExecutor je=(JavascriptExecutor) driver;
		je.executeScript("arguments[0].click()",email);
		je.executeScript("arguments[0].value='"+properties.getProperty("mobile")+"'",email);
		je.executeScript("arguments[0].value='"+properties.getProperty("pwd")+"'",pword);
		//		Actions actions=new Actions(driver);
		//		actions.click(email).sendKeys(properties.getProperty("mobile"));
		//		driver.findElement(By.xpath("//span[text()='Phone number, username, or email']"))
		//		.sendKeys(properties.getProperty("mobile"));
		//		.sendKeys(properties.getProperty("pwd"));


	}

}
