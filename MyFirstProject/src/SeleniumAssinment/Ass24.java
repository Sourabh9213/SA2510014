package SeleniumAssinment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Ass24 {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.partialLinkText("Money")).click();
		driver.findElement(By.partialLinkText("Gainers")).click();
		List<WebElement> Headers = driver.findElements(By.xpath("/html/body/div[6]/div[1]/table/thead/tr/th"));
		for (WebElement H : Headers) {
			System.out.println("All Header " + H.getText());

		}

		List<WebElement> Rows = driver.findElements(By.xpath("/html/body/div[6]/div[1]/table/tbody/tr"));

		System.out.println("Number Of Row " + Rows.size());

		Random RR = new Random();
		int randomindex = RR.nextInt(Rows.size());
		System.out.println("Random Row Index : " + randomindex);
		WebElement RandomRowData = Rows.get(randomindex);
		System.out.println("Random Row data :" + RandomRowData.getText());

		List<WebElement> Companies = driver.findElements(By.xpath("/html/body/div[6]/div[1]/table/tbody/tr/td[1]"));
		int i = 1;
		for (WebElement C : Companies) {

			System.out.println("No " + i + " " + C.getText());
			i++;
		}

		List<WebElement> CurrentPrice = driver.findElements(By.xpath("/html/body/div[6]/div[1]/table/tbody/tr/td[4]"));

		List<Double> PriceList = new ArrayList<>();

		int a = 0;
		for (WebElement CP : CurrentPrice) {

			String Ptext = CP.getText().trim().replace(",", "");
			PriceList.add(Double.parseDouble(Ptext));
			System.out.println(PriceList.get(a));
			a++;
		}

		double Highestprice = Collections.max(PriceList);
		System.out.println("Here is Higher Price From Rediff   -> " + Highestprice);

		driver.quit();

	}

}
