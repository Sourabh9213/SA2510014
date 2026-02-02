package SeleniumAssinment;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass31 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Scroll = driver.findElement(By.id("singleFileInput"));
		
		js.executeScript("arguments[0].scrollIntoView(true)",Scroll);
		Thread.sleep(4000);
		Scroll.sendKeys("C:\\Users\\admin\\Desktop\\555.jpeg");
		driver.findElement(By.xpath("//button[text()='Upload Single File']")).click();
		
		WebElement Multi = driver.findElement(By.id("multipleFilesInput"));
		
		Multi.sendKeys("C:\\Users\\admin\\Desktop\\555.jpeg" + "\n"
				+ "C:\\Users\\admin\\Desktop\\555 - Copy.jpeg " +"\n"
				+ "C:\\Users\\admin\\Desktop\\555 - Copy (2).jpeg");
		driver.findElement(By.xpath("//form[2]/button[@type=\"submit\"]")).click();

		
		
		
		
		
	}

}
