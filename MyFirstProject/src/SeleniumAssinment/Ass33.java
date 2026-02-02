package SeleniumAssinment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ass33 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.irctc.co.in/nget/profile/user-registration");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form/div[2]/button[@type=\"submit\"]"))).click();

		driver.findElement(By.id("userName")).sendKeys("Money");
		driver.findElement(By.id("fullName")).sendKeys("Money paisa rupaya");
		driver.findElement(By.id("usrPwd")).sendKeys("Andha@Paisa1");
		driver.findElement(By.id("cnfUsrPwd")).sendKeys("Andha@Paisa1");
		driver.findElement(By.id("email")).sendKeys("Black@money.com");

		Select select = new Select(driver.findElement(By.tagName("select")));

		for (WebElement Contries : select.getOptions()) {
			if (Contries.getText().contains("India")) {
				Contries.click();
				break;
			}
		}

		driver.findElement(By.id("mobile")).sendKeys("9222004861");
		WebElement Capt = driver.findElement(By.name("captcha"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		// For Captcha
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//app-captcha/div/div/div/span[2]/a/span"))).click();
		Capt.click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		String MSG = driver.findElement(By.xpath("")).getText();
		System.out.println("Your Application Submited sussesfully  "+MSG);

	}

}
