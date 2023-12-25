package Webelement;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.instagram.com/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		Thread.sleep(5000);
		File photo=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("./errorphoto/insta.png");
		//photo.renameTo(destination);
		//FileUtils.copyFile(photo, destination);
		FileHandler.copy(photo, destination);
		Thread.sleep(5000);
		driver.quit();
		
	}

}
