package ClassDemos;

import org.testng.annotations.*;

public class DemoTests {
	
	@Test
	public void  test1() {
		System.out.println("Test1");
	}
	
	@Test
	public void  test2() {
		System.out.println("Test2");
	}
	@Test
	public void  test3() {
		System.out.println("Test3");
	}
	@Test
	public void  test4() {
		System.out.println("Test4");
	}
	
	@BeforeMethod
	public void Before550() {
	System.out.println("BeforeMethod 10000");
		}

	@BeforeMethod
	public void Before2() {
		System.out.println("BeforeMethod 2");
	}
	
	@AfterMethod
	public void After1() {
		System.out.println("After 1");
	}
	
	@AfterMethod
	public void After2() {
		System.out.println("After 2");
	}
	
	@BeforeTest
	public void BT(){
		System.out.println("before test");
	}

}