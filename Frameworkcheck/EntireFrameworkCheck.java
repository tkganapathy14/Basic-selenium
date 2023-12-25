package Frameworkcheck;

import static org.testng.Assert.assertTrue;

import org.checkerframework.framework.qual.DefaultQualifier.List;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.ExcelUtility;
import genericUtilities.ItestListener;
@Listeners(ItestListener.class)
public class  EntireFrameworkCheck extends BaseClass{

	@Test
	public void sampletestcase()
	{		
		driver.findElement(By.linkText("Log in")).click();
		assertTrue(true);
	}
	@Test(enabled = false)
	public void sampletestcase1()
	{		
		driver.findElement(By.linkText("Log in")).click();
		assertTrue(false);
	}
	@Test(dataProvider = "data",dataProviderClass = ExcelUtility.class)
	public void excelcheck(String a,String b) throws InterruptedException
	{
		//System.out.println(a);
		driver.findElement(By.id("small-searchterms")).sendKeys("camera");
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("Email")).sendKeys(a);
		driver.findElement(By.id("Password")).sendKeys(b);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		webdriverutility.returnAlertreference().accept();
		//Thread.sleep(2000);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.linkText("Books")).click();
	}
}
