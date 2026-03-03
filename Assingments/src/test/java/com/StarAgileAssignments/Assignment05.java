package com.StarAgileAssignments;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;


public class Assignment05 {
	
//	5. Write a WebDriver script to capture a screenshot of a webpage and save it to a specific location
	
	
	public static void TakeSS (WebDriver driver,String fileName) throws IOException {
		File ScreenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("./ScreenShots/"+ fileName + ".jpeg");
		FileHandler.copy(ScreenShot, destination);
	}
	
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[id=\"username\"]")).sendKeys("student");
		driver.findElement(By.cssSelector("input[id=\"password\"]")).sendKeys("Password123");
		driver.findElement(By.cssSelector("button[id=\"submit\"]")).click();
		TakeSS(driver,"SS01");
		WebElement MSG = driver.findElement(By.cssSelector("h1[class^=\"post\"]"));		

		System.out.println("Login Success :  " + MSG.getText());
		
		driver.findElement(By.partialLinkText("Log out")).click();
		
		TakeSS(driver,"SS02");
		System.out.println("SS Takes Sussesfully");
		
		driver.quit();

		
		
		
		
	}
	
	

}


