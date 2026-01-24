package SeleniumAssinment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ass18 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
				
		
		WebElement Doc3 = driver.findElement(By.cssSelector("#drop1"));
		
		Select D3 = new Select(Doc3);
		
		D3.selectByIndex(3);
	
		
		System.out.println("Seleted Test From doc3 : " + D3.getFirstSelectedOption().getText() );
		driver.quit();	
	}
	
}
