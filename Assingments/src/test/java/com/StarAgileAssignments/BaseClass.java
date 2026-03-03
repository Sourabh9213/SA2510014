package com.StarAgileAssignments;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	protected WebDriver driver;

	public WebDriver OpenBrowser(String BrowserName, String URL) {

		if (BrowserName.equals("Chrome")) {
			driver = new ChromeDriver();
		} else if (BrowserName.equals("Edge")) {
			driver = new EdgeDriver();
		} else if (BrowserName.equals("Firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("Ivalid Browser Seleted !");
		}
	
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}

	public void TearDown() {

		driver.quit();
	}

}
