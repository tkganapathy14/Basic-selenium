package Frameworkcheck;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.ItestListener;

@Listeners(ItestListener.class)
public class ListenerCheck  extends BaseClass{
	@Test
	public void navigatetoFacebook() {

		driver.get("https://www.facebook.com/");
		assertTrue(false);		
	}
	@Test(enabled = false)
	public void NavigatetoInsta() {

		driver.get("https://www.instagram.com/");
		assertTrue(false);		
	}
	@Test
	public void NavigatetoGoogle() {

		driver.get("https://www.google.com/");
		assertTrue(false);		
	}

}
