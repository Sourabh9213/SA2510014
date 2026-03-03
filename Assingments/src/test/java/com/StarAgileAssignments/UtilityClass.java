package com.StarAgileAssignments;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {
	
	WebDriver driver;
	
	public UtilityClass (WebDriver driver) {
		this.driver = driver;
	}
	
	public void ScreenShot(String fileName) throws IOException {
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File ("./ScreeShot/"+ fileName + ".jpeg");
		FileHandler.copy(screenshot, destination);		
	}
	

}
