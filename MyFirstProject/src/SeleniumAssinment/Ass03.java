package SeleniumAssinment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass03 {
	
	public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
			driver.manage().window().maximize();
			driver.findElement(By.id("txtCustomerID")).sendKeys("Sourabh");
			driver.findElement(By.id("txtPassword")).sendKeys("Sour@1234");
			driver.findElement(By.id("Butsub")).submit();
			
			Thread.sleep(5000);
			driver.close();
		}
		
		
		
	}


