package Webelement;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://www.facebook.com");
		TakesScreenshot ss=(TakesScreenshot) driver;
		File photo=ss.getScreenshotAs(OutputType.FILE);
		File destination=new File("./errorphoto/demo.png");
		//photo.renameTo(destination);
		//FileUtils.copyFile(photo, destination);
		org.openqa.selenium.io.FileHandler.copy(photo, destination);
		driver.quit();
	}

}
