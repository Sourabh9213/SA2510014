package SeleniumAssinment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ass09 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[name^=\"name\"]")).sendKeys("Sourabh Matade");
		driver.findElement(By.cssSelector("input[id^=\"login\"]")).sendKeys("Sourabh1311");
		driver.findElement(By.cssSelector("input[name^=\"pass\"]")).sendKeys("Sour@1311");
		driver.findElement(By.cssSelector("input[name^=\"confirm\"]")).sendKeys("Sour@1311");
		driver.findElement(By.cssSelector("input[name^=\"alte\"]")).sendKeys("Sourabh90@gmail.com");
		
		driver.findElement(By.cssSelector("#mobno")).sendKeys("8855885588");
		
		
	}
	
}
