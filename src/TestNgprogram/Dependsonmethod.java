package TestNgprogram;

import org.testng.annotations.Test;

public class Dependsonmethod {
	
	@Test(dependsOnMethods = "homepage")
	public void logout() {
		System.out.println("this is logout");
	}
	@Test
	public void login() {
		System.out.println("this is login");
	}
	@Test(dependsOnMethods = "login")
	public void homepage() {
		System.out.println("this is homepage");
	}

}
