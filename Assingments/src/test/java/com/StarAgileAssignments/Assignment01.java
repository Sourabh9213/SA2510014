package com.StarAgileAssignments;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Assignment01 {

	public static void main(String[] args) throws InterruptedException, IOException {

//		1. Write a WebDriver script to navigate to a website and click on a specific link.
		
		WebDriver driver = new EdgeDriver();
		UtilityClass TakeSS = new UtilityClass(driver);
	

		driver.get("https://tutorialsninja.com/demo/"); // open application / link
		driver.manage().window().maximize();
		System.out.println("Application launched successfully.");
		Assert.assertTrue(driver.getTitle().contains("Your Store"), "Homepage URL is not loaded correctly.!!!!");
		TakeSS.ScreenShot("HomePage");

		Thread.sleep(3000);// For Taking ScreenShots
		driver.findElement(By.cssSelector("ul.navbar-nav>li:nth-child(5)>a")).click();
		System.out.println("Clicked on 'Software Tab' link.");
		Assert.assertTrue(driver.findElement(By.cssSelector("div[id='content'] h2")).getText().contains("Software"),
				"Login Page did not open after clicking 'Software tab' link.");
		TakeSS.ScreenShot("OpenSofwareTab");

		Thread.sleep(4000);// For Taking ScreenShots
		driver.navigate().back();
		Assert.assertTrue(driver.getTitle().contains("Your Store"), "Did not Navigated back to Homepage.");
		System.out.println("Navigated back to Homepage.");
		TakeSS.ScreenShot("NavigatedBack");

		Thread.sleep(4000);// For Taking ScreenShots
		driver.navigate().forward();
		Assert.assertTrue(driver.findElement(By.cssSelector("div[id='content'] h2")).getText().contains("Software"),
				"WebPage did not Navigated forward to Login Page again.");
		System.out.println("Navigated forward to Login Page again.");
		TakeSS.ScreenShot("NavigatedForward");

		Thread.sleep(3000);// For Taking ScreenShots

		driver.quit();

	}

}
