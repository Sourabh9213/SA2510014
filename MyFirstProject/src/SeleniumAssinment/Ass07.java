package SeleniumAssinment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass07 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("student", Keys.TAB, "Password", Keys.TAB, Keys.SPACE);

		String CurrentURL = driver.getCurrentUrl();

		System.out.println("This is Current URL -   " + CurrentURL);

	}

}
