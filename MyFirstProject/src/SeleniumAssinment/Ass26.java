package SeleniumAssinment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Ass26 {
	
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		String un = "Sourabh2";
		
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> Headers = driver.findElements(By.xpath("//div[@role=\"columnheader\"]"));
		
		
		System.out.println("All Hearders");

		for(WebElement H : Headers) {		
			System.out.println(H.getText());
				}
		
		driver.findElement(By.id("addNewRecordButton")).click();
		driver.findElement(By.id("firstName")).sendKeys(un);
		driver.findElement(By.id("lastName")).sendKeys("Matade");
		driver.findElement(By.id("userEmail")).sendKeys("Sourabh9213@gmail.com");
		driver.findElement(By.id("age")).sendKeys("32");
		driver.findElement(By.id("salary")).sendKeys("20000");
		driver.findElement(By.id("department")).sendKeys("QA");
		driver.findElement(By.id("submit")).submit();
		
		driver.findElement(By.id("searchBox")).sendKeys(un);
		
		List<WebElement> Rows = driver.findElements(By.xpath("//div[@role=\"rowgroup\"]"));
		
		for(WebElement r: Rows) {
			System.out.println(r.getText());
		
		if(r.getText().contains(un)) {
			
			driver.findElement(By.cssSelector("span[id^=\"delete\"]")).click();			
			System.out.println(un + "Record is Deleted");
			
			
			
		}}
		
	}

}
