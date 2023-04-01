package org.Attributes;

import org.testng.annotations.Test;

public class TestNgAttributes {
	@Test(priority=0)
	public void firstTestCase() { 
		System.out.println("This is First test case");  //normal method
	}
  @Test(priority=3,timeOut=300)
	public void secondTestCase() {
		System.out.println("This is Second testcase");
	}
  @Test(priority=2,enabled=false)  //skip the test case
  public void thirdTestase() {
	  System.out.println("This is Third TestCase");
  }
  @Test(priority=1,description="This is the priority ")
  //testng always execution the alphapetic order
  //so we need to use priority=0 of test cases
  //@Test(priority=0) we should use this priority it execute order level
  public void fourthTestCase() {
	  System.out.println("Fouth Test");
  }
  
 @Test (dependsOnMethods="fourthTestCase")
public void fifth() {
	  System.out.println("Fifth");
  }

}
