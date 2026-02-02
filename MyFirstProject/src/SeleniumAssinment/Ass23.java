package SeleniumAssinment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Ass23 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		FluentWait<WebDriver> wait = new FluentWait<>(driver);

		wait.withTimeout(Duration.ofSeconds(15)).pollingEvery(Duration.ofSeconds(1))
				.ignoring(NoSuchElementException.class)
				.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys("admin");

		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

		String CrntURL = driver.getCurrentUrl();
		if (CrntURL.contains("dashboard")) {

			System.out.println("Login Is sussecfull");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/i")).click();

			driver.findElement(By.partialLinkText("Logout")).click();

		} else {
			System.out.println("Login Failed " + driver
					.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p"))
					.getText());
		}
		Thread.sleep(5000);

	}
}