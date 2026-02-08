package Assingments.Assingments;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TAss01 {
	
	WebDriver driver ;
	
  @Test(priority = 1)
  public void Downloads() {
	  
	  driver.findElement(By.partialLinkText("Downloads")).click();
  }
  
  @Test(priority = 2)
  public void Documentation() {
	  driver.findElement(By.partialLinkText("Documentation")).click();
  }
  
  @Test(priority = 3)
  public void Projects() {
	  driver.findElement(By.partialLinkText("Projects")).click();
  }
  
  @Test(priority = 4)
  public void Support() {
	  driver.findElement(By.partialLinkText("Support")).click();
  }
  
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	 
	  System.out.println("----------******-------");
	  System.out.println("Title   : "+ driver.getTitle());
	  Thread.sleep(2000);
	  
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  System.out.println("----------########------");
	  System.out.println("Title   : "+ driver.getTitle());
	  Thread.sleep(2000);
  }

  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  driver = new EdgeDriver();
	  driver.get(" https://www.selenium.dev/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
  }

  @AfterTest
  public void afterTest()  {
	  
	  driver.quit();
  }

}
