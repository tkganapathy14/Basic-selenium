package SelectClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenium app/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/tkgan/OneDrive/Documents/selectclass.html");
		WebElement dropdown=driver.findElement(By.id("m1"));
		Select select=new Select(dropdown);
		List<WebElement> alloption = select.getOptions();
//		for(WebElement option:alloption)
//		{
//			System.out.println(option.getText());
//		}
//		
           for(int i=0;i<alloption.size();i++)
           {
        	   select.selectByIndex(i);
        	   System.out.println(alloption.get(i).getText());
        	   System.out.println(alloption.get(i).getAttribute("value"));
        	   
           }
	}

}
