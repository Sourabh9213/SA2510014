package SeleniumAssinment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass02 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		driver.manage().window().maximize();
		driver.findElement(By.name("txtCustomerID")).sendKeys("Sourabh");
		driver.findElement(By.name("txtPassword")).sendKeys("Sour@1234");
		driver.findElement(By.name("Butsub")).submit();
		
		Thread.sleep(5000);
		driver.close();
	}

}
