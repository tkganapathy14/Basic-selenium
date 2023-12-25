package Assertion;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.Test;

public class AssertEqual {

	@Test
	public void HardAssert()
	{
		String Expected="abc";
		String Actual="bcd";
		assertNotEquals(Actual,Expected);
		System.out.println("test case Passed");
	}
}
