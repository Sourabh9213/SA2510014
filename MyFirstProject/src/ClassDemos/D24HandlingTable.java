package ClassDemos;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class D24HandlingTable {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		//List<WebElement> Headers = driver.findElements(By.tagName("th"));
		List<WebElement> Headers = driver.findElements(By.xpath	("//table[@class=\"dataTable\"]/thead/tr"));
		
		System.out.println("--------------All Headers");
		for(WebElement H : Headers) {
			System.out.println(H.getText());			
		}
		
		List<WebElement> allRows = driver.findElements(By.xpath(""));
		
		
	}
}