package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/tkgan/OneDrive/Desktop/demowegpage.html");
		driver.findElement(By.id("username")).sendKeys("Ganapathy");
		driver.findElement(By.name("password")).sendKeys("7207792375");
		driver.findElement(By.className("confirmepwd")).sendKeys("7207792375");
	}

}
//illegal state exception ----->100% error in only system.property line 