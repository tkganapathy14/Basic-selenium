package Webelement;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakescreenshotFB {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		WebElement singleele=driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		File src=singleele.getScreenshotAs(OutputType.FILE);
		File dest=new File("./errorphoto/fbsingleele.png");
		FileUtils.copyFile(src, dest);
		
	}

}
