package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadRobot {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.findElement(By.id("pickfiles")).click();
		Thread.sleep(4000);
		Robot robot=new Robot();
		//put path to file in a clipboard
		StringSelection ss=new StringSelection("C:\\Users\\tkgan\\Downloads\\Ganapathy (16).pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		//press ctrl+V key
		robot.keyPress(KeyEvent.VK_CONTROL);//press ctrl key
		robot.keyPress(KeyEvent.VK_V);//press V
		//release Ctrl+V key
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(4000); 
		// press Enter key
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		//driver.quit();
	}

}
