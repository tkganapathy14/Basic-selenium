package SelectClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectgetalloption {

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
		select.selectByValue("Manual");
		Thread.sleep(4000);
		select.selectByIndex(1);
		Thread.sleep(4000);
		System.out.println(select.getFirstSelectedOption().getText());
		List<WebElement> alloption = select.getAllSelectedOptions();
		for(WebElement option:alloption)
		{
			System.out.println(option.getText());
		}
	}

}
