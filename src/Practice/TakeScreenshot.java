package Practice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {

	System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/");
	TakesScreenshot ts=(TakesScreenshot) driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	File destination=new File("./errorphoto/amazon.png");
	//source.renameTo(destination);
	FileUtils.copyFile(source, destination);
//	FileHandler.copy(source, destination);
	
	}

}
