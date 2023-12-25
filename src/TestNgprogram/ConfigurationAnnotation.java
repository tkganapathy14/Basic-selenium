package TestNgprogram;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ConfigurationAnnotation {
  @Test
  public void Testcase1() {
	  System.out.println("this is test Case1");
  }
  @Test
  public void Testcase2() {
	  System.out.println("this is test Case2");
  }

  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("this is Before Method"); 
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("this is After Method"); 

  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("this is Before Class"); 

  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is After Class"); 
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("this is Before Test"); 

  }

  @AfterTest
  public void afterTest() {
	  System.out.println("this is After Test"); 
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("this is Before Suite"); 
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("this is After Suite"); 
  }

}
