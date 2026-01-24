package SeleniumAssinment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass12 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//section/div/div[1]/input")).sendKeys("student");
		driver.findElement(By.xpath("//section/div/div[2]/input")).sendKeys("Password123");
		driver.findElement(By.xpath("//section/div/button")).click();
		String CUrl =driver.getCurrentUrl();
		WebElement MSG = driver.findElement(By.xpath("//h1"));
		
		
		if(CUrl.contains("successfully")) {
		System.out.println("Test Pass :" + CUrl );
		System.out.println(MSG.getText());
		driver.findElement(By.partialLinkText("Log out")).click();
		Thread.sleep(2000);
		}
		else {
			System.out.println("Test Fail " + CUrl );
		}
		
		
		
		driver.quit();
	}

}
