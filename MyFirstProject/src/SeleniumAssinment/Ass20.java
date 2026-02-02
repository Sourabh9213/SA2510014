package SeleniumAssinment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ass20 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		String URL = "https://www.redbus.in/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
		
		WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10));
		
		
		driver.findElement(By.id("srcinput")).sendKeys("kolh");	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-label='Kolhapur(Maharashtra)']"))).click();
		
		driver.findElement(By.id("destinput")).sendKeys("mumb");		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='root']/main[@role='main']/div[@class='main__ind-home-styles-module-scss-c6mG4']/div/div/search[@aria-label='Bus ticket']/div[contains(@class,'searchWidgetWrapper__ind-home-styles-module-scss-fp9dm')]/div[contains(@class,'searchWidget___68c268')]/div[contains(@class,'commonSuggestionWrapper___c43fbd')]/div[@aria-label='Search suggestions']/div[@aria-label='Search suggestions list']/div[1]/div[1]"))).click();
		Thread.sleep(2000);
		driver.findElement(By.id("destinput")).sendKeys(Keys.ARROW_DOWN , Keys.ENTER);
		

		
		
//		driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/search/div/div/div[1]/div[1]/div[3]/div[1]/div/div")).click();
		driver.findElement(By.className("dojWrapper___6e780d")).click();
		String expectedMonth = "Dec";
		String Date = "2";
		
		while(true){
			String Month = driver.findElement(By.xpath("")).getText();
			if (Month.contains(expectedMonth)) {
				break;
			}else {
				driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/search/div/div/div[1]/div[1]/div[3]/div[1]")).click();					
				}
			}
		driver.findElement(By.xpath("//span[text()="+ Date +"]")).click();
			
			
		}


		
		
	}
