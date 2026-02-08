package SeleniumAssinment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ass36 {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.nimblework.com/resources/?tx_post_tag=case-studies");
		
		SearchContext ShadowRoot = driver.findElement(By.xpath("//*[@id=\"kairon-client-container\"]/div")).getShadowRoot();
		ShadowRoot.findElement(By.className("buttonInternal")).click();
		ShadowRoot.findElement(By.cssSelector("input[placeholder='Type a message']")).sendKeys("hi... " + Keys.ENTER);
		String Rpl = ShadowRoot.findElement(By.className("message")).getText();
		
		
		if(Rpl.contains("Hello")) {
			System.out.println("Reply From Chat box --> " + Rpl);
			
			driver.close();
		}
		
	}
}
