package TestNgprogram;

import org.testng.annotations.Test;

public class EnableMethod {
	
	@Test(enabled = false)//-------->test case not execute
	public void logout() {
		System.out.println("this is logout");
	}
	@Test(priority = 0)
	public void login() {
		System.out.println("this is login");
	}
	@Test()//(dependsOnMethods = "logout")------>it will throw testNg exception
	public void homepage() {
		System.out.println("this is homepage");
		
	}

}
