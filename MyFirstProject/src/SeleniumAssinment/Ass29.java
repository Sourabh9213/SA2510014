package SeleniumAssinment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ass29 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://omayo.blogspot.com/");
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy (0,400)", "");		
		
		
		driver.findElement(By.id("alert1")).click();
		System.out.println("Clicked On ClickToGetAlert");
		
		Alert Art = driver.switchTo().alert();
		System.out.println("Alret Box MSG : " + Art.getText());
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		
		
		driver.findElement(By.id("prompt")).click();
		System.out.println("Clicked On GetPrompt");
		
		Art = driver.switchTo().alert();
		System.out.println("Alret Box MSG : " + Art.getText());
		Thread.sleep(3000);
		
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));	
		Art = wait.until(ExpectedConditions.alertIsPresent());
		
		Art.sendKeys("GAGAGAGAGAGA");// Work hot nahiye pls check		
		Thread.sleep(3000);		
		System.out.println(Art.getText());
		Art.accept();
		
		
		driver.findElement(By.id("confirm")).click();
		System.out.println("Clicked On GetConfirmation");
		
		Art = driver.switchTo().alert();
		System.out.println("Alret Box MSG : " + Art.getText());
		Thread.sleep(3000);
		Art.dismiss();
		
		
		
		
	}

}
