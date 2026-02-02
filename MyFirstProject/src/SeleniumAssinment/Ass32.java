package SeleniumAssinment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass32 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://istqb.in/");
		List<WebElement> Menus = driver.findElements(By.xpath("//nav/ul/li"));

		for (int i = 1; i <= Menus.size(); i++) {
			WebElement M = driver.findElement(By.xpath("//nav/ul/li[" + i + "]"));
			System.out.println("Menu " + i + " " + M.getText());
		}

		driver.close();
	}

}
