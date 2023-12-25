package TestNgprogram;

import org.testng.annotations.Test;

public class TestNg1 {
	
	@Test(priority = -1)
	public void logout() {
		System.out.println("this is logout");
	}
	@Test(priority = 0)
	public void login() {
		System.out.println("this is login");
	}
	@Test(priority = 2)
	public void homepage() {
		System.out.println("this is homepage");
	}

}
