package SeleniumAssinment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Ass35 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.jotform.com/form-templates/exam-registration-form");
		Thread.sleep(2000);		
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("Total iframes: " + frames.size());
		for(WebElement f : frames) {
			System.out.println(f.getTagName());
		}
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"formPreviewArea\"]")));
	
				
		driver.findElement(By.id("first_9")).sendKeys("Sourabh");
		driver.findElement(By.id("last_9")).sendKeys("Matade");
		driver.findElement(By.id("input_10")).sendKeys("147");
		driver.findElement(By.id("input_3")).sendKeys("Automation Testing");
		
		driver.findElement(By.id("lite_mode_11")).sendKeys("01-14-2026");
		driver.findElement(By.id("lite_mode_12")).sendKeys("01-31-2026");
		
		driver.findElement(By.id("input_8")).sendKeys("hi i'm sourabh s matade ");
		driver.findElement(By.id("input_16")).click();
		
		

	}

}
