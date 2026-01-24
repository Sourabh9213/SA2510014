package SeleniumAssinment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass08 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[id=\"username\"]")).sendKeys("student");
		driver.findElement(By.cssSelector("input[id=\"password\"]")).sendKeys("Password123");
		driver.findElement(By.cssSelector("button[id=\"submit\"]")).click();
		WebElement MSG = driver.findElement(By.cssSelector("h1[class^=\"post\"]"));		

		System.out.println("Login Success :  " + MSG.getText());
		
		driver.findElement(By.partialLinkText("Log out")).click();
		
		driver.quit();

	}

}
