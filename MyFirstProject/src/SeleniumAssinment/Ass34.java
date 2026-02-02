package SeleniumAssinment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ass34 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com");
		WebElement DD = driver.findElement(By.xpath("//button[text()=\"Copy Text\"]"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(1000);

		WebElement T1 = driver.findElement(By.id("field1"));
		String Text1 = T1.getAttribute("value");

		Actions Act = new Actions(driver);
		Act.doubleClick(DD).perform();
		Thread.sleep(1000);

		WebElement T2 = driver.findElement(By.id("field2"));
		String Text2 = T2.getAttribute("value");

		if (Text2.equals(Text1)) {
			System.out.println(" !!!!!Bingo!!!!!    Text Copied Sussesfully");

		} else {
			System.out.println("XXXXX Text NOT copied! XXXXX");
		}

		driver.close();
	}
}
