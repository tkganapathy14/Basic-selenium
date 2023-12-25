package SelectClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Webelement.Webelement;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement element=driver.findElement(By.xpath("//a[text()='Create new account']"));
		element.click();
		Thread.sleep(2000);		
		//JavascriptExecutor je=(JavascriptExecutor) driver;
		//WebElement Fname=
		driver.findElement(By.name("firstname")).sendKeys("T K");
		Thread.sleep(4000);
		//WebElement sname=
				driver.findElement(By.name("lastname")).sendKeys("Ganapathy");
				Thread.sleep(1000);
		//WebElement MobNum=
				driver.findElement(By.name("reg_email__")).sendKeys("7207792375");
				Thread.sleep(1000);
		//WebElement pword=
				driver.findElement(By.id("password_step_input")).sendKeys("Ganapathy@1007");
				Thread.sleep(1000);
//		je.executeScript("argument[0].value='T K'",Fname);
//		Thread.sleep(2000);		
//		je.executeScript("argument[0].value='Ganapathy'",sname);
//		Thread.sleep(2000);
//		je.executeScript("argument[0].value='7207792375'",MobNum);
//		Thread.sleep(2000);
//		je.executeScript("argument[0].value='123456'",pword);
//		Thread.sleep(2000);
		WebElement drop1=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		WebElement drop2=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		WebElement drop3=driver.findElement(By.xpath("//select[@title='Day']"));
		Select year=new Select(drop1);
		year.selectByVisibleText("1997");
		Thread.sleep(1000);
		Select month=new Select(drop2);
		month.selectByValue("4");	
		Thread.sleep(1000);
		Select days=new Select(drop3);
		days.selectByIndex(13);			
		Thread.sleep(1000);
		WebElement radio1=driver.findElement(By.xpath("//label[text()='Male']"));
		System.out.println(radio1.isSelected());
		Thread.sleep(1000);
		radio1.click();
		Thread.sleep(1000);
		
		System.out.println(radio1.isSelected());
		
		// DeselectByVisible Text,DeselectBy Value, DeselectByIndex
		year.deselectByVisibleText("2023");
		Thread.sleep(4000);
		month.deselectByIndex(3);
		Thread.sleep(4000);
		days.deselectByValue("14");
		Thread.sleep(4000);
		}

}
