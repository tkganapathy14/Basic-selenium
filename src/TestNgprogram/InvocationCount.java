package TestNgprogram;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(invocationCount = 3)
	public void logout() {
		System.out.println("this is logout");
	}
	@Test(invocationCount = 2)
	public void login() {
		System.out.println("this is login");
	}
	@Test(priority = 2)
	public void homepage() {
		System.out.println("this is homepage");
	}

}
