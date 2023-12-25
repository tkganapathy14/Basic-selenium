package PopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		//Alert Popup
		driver.findElement(By.name("alertbox")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(4000);
		alert.accept();
		//Confirmation popup
		driver.findElement(By.name("confirmalertbox")).click();
		Thread.sleep(4000);
		System.out.println(alert.getText());
		alert.accept();
		//Prompt popUp
		driver.findElement(By.name("promptalertbox1234")).click();
		alert.sendKeys("yes");
		alert.accept();
		Thread.sleep(4000);
		driver.quit();
	}

}
