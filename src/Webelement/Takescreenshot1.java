package Webelement;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takescreenshot1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		WebElement ele=driver.findElement(By.xpath("//div[@class=\"_8esn\"]"));
		File src=ele.getScreenshotAs(OutputType.FILE);
		File dest=new File("./errorphoto/facebookloginmodule.png");
		src.renameTo(dest);
		
		
	}

}
