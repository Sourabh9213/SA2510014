package com.StarAgileAssignments;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment03 {
//	3. Write a WebDriver script to handle a dropdown and select an option based on specific criteria.	

	public static void main(String[] args) throws  IOException {

		WebDriver driver = new ChromeDriver();
		UtilityClass TakeSS = new UtilityClass(driver);

		driver.get("https://testautomationpractice.blogspot.com/?m=1");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement drpList = driver.findElement(By.id("country"));
		Select Countries = new Select(drpList);		
		
		Countries.selectByIndex(7);
		System.out.println("Country is Selected By IndexNO: " + Countries.getFirstSelectedOption().getText());		
		TakeSS.ScreenShot("IndexNO");
	
		
		Countries.selectByContainsVisibleText("Jap");
		System.out.println("Country is Selected By ContainsVisible: " + Countries.getFirstSelectedOption().getText());				
		TakeSS.ScreenShot("ContainsVisibleText");
		
		
		Countries.selectByValue("canada");
		System.out.println("Country is Selected By Value: " + Countries.getFirstSelectedOption().getText());				
		TakeSS.ScreenShot("ByValue");
		
		
		Countries.selectByVisibleText("India");
		System.out.println("Country is Selected By VisibleText: " + Countries.getFirstSelectedOption().getText());		
		
		TakeSS.ScreenShot("VisibleText");
		
		
		driver.quit();

	}

}
