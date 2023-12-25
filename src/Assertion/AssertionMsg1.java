package Assertion;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.Test;

public class AssertionMsg1 {//Hard Assertion

	@Test
	public void AssertEqual()
	{
		String Exp="abc";
		String act="bcd";
		assertNotEquals(act,Exp,"this condition is failed");
		System.out.println("condition is true");
	}
}
