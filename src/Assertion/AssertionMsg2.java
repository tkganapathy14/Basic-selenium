package Assertion;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionMsg2 {

	@Test
	public void AssertEqual()//softAssertion
	{
		String Exp="abc";
		String act="bcd";
		SoftAssert assertion =new SoftAssert();
		assertion.assertEquals(act,Exp,"this condition is failed");
		assertion.assertAll();
	}
}
