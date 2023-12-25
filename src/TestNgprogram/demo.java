package TestNgprogram;

import org.testng.annotations.Test;

public class demo {

	@Test
	public void name() {
		System.out.println("hello");
	}
	@Test(priority = 1)
	public void name1() {
		System.out.println("hi");
	}
	}
