package SelectClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ByVisibletexValuetIndex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("file:///C:/Users/tkgan/OneDrive/Documents/selectclass.html");
WebElement dropdown=driver.findElement(By.id("m1"));
Select select=new Select(dropdown);
Thread.sleep(4000);
select.selectByVisibleText("database");
Thread.sleep(4000);
select.selectByValue("selenium");
Thread.sleep(4000);
select.selectByValue("Manual");
Thread.sleep(4000);
select.selectByIndex(1);
Thread.sleep(4000);
select.deselectByValue("SQL");
Thread.sleep(4000);
select.deselectByVisibleText("domain");
Thread.sleep(4000);
select.deselectByIndex(0);
Thread.sleep(4000);
select.deselectAll();


	}

}
