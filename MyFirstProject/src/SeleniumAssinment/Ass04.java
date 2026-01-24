package SeleniumAssinment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass04 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		driver.manage().window().maximize();
		driver.findElement(By.className("form-control")).sendKeys("Sourabh");
		driver.findElement(By.className("form-control")).sendKeys("Sour@1234");
		driver.findElement(By.className("btn")).click();
		
		Thread.sleep(5000);
		driver.close();
	}
}
