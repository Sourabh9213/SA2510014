package SeleniumAssinment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Ass38 {
	
	   
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://automationexercise.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		System.out.println("Page Title -->  " + driver.getTitle());

		js.executeScript("window.scrollTo(0,document.documentElement.scrollHeight);");

		WebElement Subscription = driver.findElement(By.xpath("//h2[text()='Subscription']"));

		if (Subscription.isDisplayed()) {			
			Thread.sleep(2000);
			System.out.println(" Subscription section is visible ");
		} else {
			System.out.println("X!X!X Subscription section is NOT visible X!X!X");
		}

		js.executeScript("window.scrollTo({top: 0, behavior: 'smooth'});");
		Thread.sleep(3000);
		
		Long ScrollPosition = (Long) js.executeScript("return window.pageYOffset;");	
		System.out.println("Scroll Position: " + ScrollPosition);

		WebElement FullFledgedMSG = driver
				.findElement(By.xpath("//h2[contains(text(),'Full-Fledged')]"));
		
	
		System.out.println("Scroll Position: " + ScrollPosition);

		if (FullFledgedMSG.isDisplayed() && ScrollPosition <= 5) {

			System.out.println(FullFledgedMSG.getText() + "  is visible ");

		} else {
			System.out.println("X!X!X FullFledgedMSG NOT visible X!X!X");
		}
		
		driver.quit();
	}

}
