package com.SourabhData;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenBrowser {
	
	
	
	
	public void OPB(String URL) {
		WebDriver driver = new EdgeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	OpenBrowser OP1 = new OpenBrowser();

}
