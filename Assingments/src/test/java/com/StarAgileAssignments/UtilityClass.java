package com.StarAgileAssignments;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {
	
	WebDriver driver;
	Properties prop;
	File file;
	
	public UtilityClass (WebDriver driver) {
		this.driver = driver;
	}
	
	public void ScreenShot(String fileName) throws IOException {
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File ("./ScreenShots/"+ fileName + ".jpeg");
		FileHandler.copy(screenshot, destination);		
	}
	
	public void GetData () throws IOException{
		file = new File("src/test/java/com/StarAgileAssignments/Data.properties");
		FileInputStream fis = new FileInputStream(file);
		prop = new Properties();
		prop.load(fis);
	}

}
