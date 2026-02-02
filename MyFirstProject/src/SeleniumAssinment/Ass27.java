package SeleniumAssinment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Ass27 {
	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		int i = 1;
		

		driver.get("https://www.iplt20.com/points-table/men/2024");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> rows = driver.findElements(By.xpath("//div[2]/div/div/div/table/tbody/tr/td[3]"));
		System.out.println("All Teams Stats:");	
		
			
			for (WebElement row : rows) {
				System.out.println(" ");
				System.out.println(row.getText());						
				System.out.println(driver.findElement(By.xpath("//div[2]/div/div/div/table/tbody/tr[" + i + "]/td[12]"))
						.getText());
				
				System.out.println("--*--*--*--*--*--*---*--*--*--*--*--");
				i++;				
			}
			
			
		
	}
}
