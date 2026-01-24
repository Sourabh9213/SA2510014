package SeleniumAssinment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass14 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/?m=1");

		List<WebElement> Products = driver.findElements(By.cssSelector("input[id$=\"day\"]"));

		for (WebElement chkbox : Products) {
			System.out.println("---------- Before Clicking -----------");
			System.out.println("Checkbox: " + chkbox.getAttribute("value"));
			System.out.println("Selected: " + chkbox.isSelected());
			System.out.println("Enabled : " + chkbox.isEnabled());
			System.out.println("Visible : " + chkbox.isDisplayed());

			if (chkbox.isSelected() == false && chkbox.isEnabled())
				chkbox.click();

			System.out.println("---------- After Clicking -----------");
			System.out.println("Checkbox: " + chkbox.getAttribute("value"));
			System.out.println("Selected: " + chkbox.isSelected());
			System.out.println("Enabled : " + chkbox.isEnabled());
			System.out.println("Visible : " + chkbox.isDisplayed());

		}

		Thread.sleep(2000);
		driver.quit();
	}

}