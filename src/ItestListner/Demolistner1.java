package ItestListner;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Itest1.class)
public class Demolistner1 {
@Test
	public void name() {
		System.out.println("hi");
	}
}
