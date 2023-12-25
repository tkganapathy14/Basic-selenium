package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movetoelement {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("https://www.myntra.com/");
WebElement element=driver.findElement(By.linkText("MEN"));
Actions actions=new Actions(driver);
actions.moveToElement(element).perform();

	}

}
