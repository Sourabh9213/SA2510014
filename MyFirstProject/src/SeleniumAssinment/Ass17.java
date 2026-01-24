package SeleniumAssinment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ass17 {

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
		
		WebElement Day = driver.findElement(By.cssSelector("select[name^=\"DOB_D\"]"));
		WebElement Month = driver.findElement(By.cssSelector("select[name^=\"DOB_M\"]"));
		WebElement Year = driver.findElement(By.cssSelector("select[name^=\"DOB_Y\"]"));
		Select DD = new Select(Day);
		Select MM = new Select(Month);
		Select YY = new Select(Year);
		DD.selectByContainsVisibleText("02");
		MM.selectByContainsVisibleText("DEC");
		YY.selectByContainsVisibleText("1991");
		
		System.out.println("My Birth Date: " + DD.getFirstSelectedOption().getText() +" "+ MM.getFirstSelectedOption().getText() +" "+ YY.getFirstSelectedOption().getText());
		
		driver.quit();	
	}
	
}
