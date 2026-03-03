package com.StarAgileAssignments;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment04 {
	//4. Implement a test case using WebDriver to validate the functionality of a registration form.
	
	 public static void main(String[] args) throws IOException {
		
		 WebDriver driver = new EdgeDriver();
		 UtilityClass TakeSS = new UtilityClass(driver);
		 
		 driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.findElement(By.id("input-firstname")).sendKeys("saba");
		 
		 driver.findElement(By.cssSelector("#input-lastname")).sendKeys("sourabh");
		 
		 driver.findElement(By.name("email")).sendKeys("sadoo@gmail.com");
		 
		 driver.findElement(By.cssSelector("input[type='tel']")).sendKeys("9222005520");
		 
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@1311");
		 
		 driver.findElement(By.cssSelector("input[id$='confirm']")).sendKeys("Test@1311");
		 
		 WebElement confirmBTN = driver.findElement(By.xpath("//input[@type='checkbox']"));
		 if(confirmBTN.isDisplayed() && confirmBTN.isEnabled() && !confirmBTN.isSelected()) {
			 confirmBTN.click();			 
		 };
		 
		 System.out.println("All registration details have been entered successfully.");
		 TakeSS.ScreenShot("FormFilled");
		 
		 driver.findElement(By.cssSelector("input[type='submit']")).submit();
		 
		 String MSG = driver.findElement(By.xpath("//div[@id='content']/h1")).getText();		 
		 System.out.println("Registration completed successfully. Confirmation message: " + MSG);
		 TakeSS.ScreenShot("CompletedRegistration");
		 
		 
	}

}
