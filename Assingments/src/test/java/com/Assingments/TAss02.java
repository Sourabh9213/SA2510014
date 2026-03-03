package com.Assingments;

import java.time.Duration;

import org.openqa.selenium.*;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;



public class TAss02 {
	
	WebDriver driver ;
	
  @Test(dataProvider = "getLoginData")
  public void Login() {
	  
	  driver.findElement(By.partialLinkText("Downloads")).click();
  }
  

  
@DataProvider
public Object[][] getLoginData() {
	return new Object[][] {
		new Object[] { "admin", "admin123" },
		new Object[] { "priya", "priya123" },
		new Object[] { "ankit", "ankit123" },
		new Object[] { "admin", "admin123" },
	};
	
}

@BeforeMethod
public void DisplyMSG() {
	
}
@AfterMethod
public void LogOut() {
	
}
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  driver = new EdgeDriver();
	  driver.get(" https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
  }

  @AfterTest
  public void afterTest()  {
	  
	  driver.quit();
  }

}
