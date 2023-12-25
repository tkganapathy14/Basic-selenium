package DemoPractices;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StudentForm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
		driver.findElement(By.name("First_Name")).sendKeys("T K");
		driver.findElement(By.name("Last_Name")).sendKeys("Ganapathy");
		WebElement Day = driver.findElement(By.id("Birthday_Day"));
		WebElement Month = driver.findElement(By.id("Birthday_Month"));
		WebElement Year = driver.findElement(By.id("Birthday_Year"));
		Select select=new Select(Day);
		select.selectByValue("14");
		Thread.sleep(1000);
		Select select2=new Select(Month);
		select2.selectByValue("April");
		Thread.sleep(1000);
		Select select3=new Select(Year);
		select3.selectByValue("1997");
		Thread.sleep(1000);
		driver.findElement(By.name("Email_Id")).sendKeys("tkganapathy@gmail.com");
		driver.findElement(By.name("Mobile_Number")).sendKeys("7207792375");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value=\"Male\"]")).click();
		driver.findElement(By.name("Address")).sendKeys("7-148,V K M ST,PUDUPET,NAGARI(M)");
		driver.findElement(By.name("City")).sendKeys("Nagari");
		Thread.sleep(1000);
		driver.findElement(By.name("Pin_Code")).sendKeys("517590");
		driver.findElement(By.name("State")).sendKeys("ANDHRA PRADESH");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		Thread.sleep(6000);
		WebDriverWait wait=new WebDriverWait(driver,10);
		WebElement element=driver.findElement(By.xpath("(//input[@type=\"radio\"])[6]"));
		wait.until(ExpectedConditions.visibilityOf(element)).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

}
