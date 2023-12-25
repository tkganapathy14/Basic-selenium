package TestNgprogram;

import org.testng.annotations.Test;

public class DependsonmethodsandPriority {
	
	@Test(dependsOnMethods = "homepage",priority = -200000)
	public void logout() {
		System.out.println("this is logout");
	}
	@Test(priority = 1000)
	public void login() {
		System.out.println("this is login");
	}
	@Test(dependsOnMethods = "login",priority = -9000)
	public void homepage() {
		System.out.println("this is homepage");
	}
	@Test(priority = 1000)
	public void l1ogin() {
		System.out.println("from login 1");
	}

}
