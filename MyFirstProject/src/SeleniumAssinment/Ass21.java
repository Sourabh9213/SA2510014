package SeleniumAssinment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ass21 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		String URL = "https://dash.bling-center.com/platform/signIn.html";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);

		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[2]/div/div/div[5]/button")).click();
		driver.findElement(By.id("email1")).sendKeys("sourabh9213@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div[2]/button[2]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		String MSG = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resetsuccess"))).getText();
		
		System.out.println("Password is Reset & mail it --" + MSG);

		driver.quit();
	}
}
