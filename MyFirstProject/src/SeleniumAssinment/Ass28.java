package SeleniumAssinment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Ass28 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/?m=1");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1100)");

		List<WebElement> Pages = driver.findElements(By.xpath("//div[5]/div/div/ul/li"));
		System.out.println("Number OF Pages - " + Pages.size());

		int TotalRows = 0;

		for (int i = 1; i <= Pages.size(); i++) {
			driver.findElement(By.xpath("//div[5]/div/div/ul/li[" + i + "]")).click();
			List<WebElement> Rows = driver.findElements(By.xpath("//div[5]/div/div/table/tbody/tr"));
			int NoOfRows = Rows.size();
			for (int a = 1; a <= Rows.size(); a++) {
				WebElement ChkBox = driver
						.findElement(By.xpath("//div[5]/div/div/table/tbody/tr[" + a + "]/td[4]/input"));
				System.out.println("-------***Before Select--------");
				System.out.println("" + ChkBox.isDisplayed());
				System.out.println("" + ChkBox.isEnabled());
				System.out.println("" + ChkBox.isSelected());
				if (ChkBox.isEnabled() && !ChkBox.isSelected()) {
					ChkBox.click();
				}

				System.out.println("Page No- " + i + " Has " + NoOfRows + " No of Rows ");
				System.out.println("-------***After Select--------");
				System.out.println("" + ChkBox.isDisplayed());
				System.out.println("" + ChkBox.isEnabled());
				System.out.println("" + ChkBox.isSelected());
			}

			TotalRows = TotalRows + NoOfRows;
			Thread.sleep(2000);
		}
		System.out.println("Total No Of Rows in Pagination Web Table : " + TotalRows);

		driver.quit();
	}

}
