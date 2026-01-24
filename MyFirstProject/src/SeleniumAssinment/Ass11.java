package SeleniumAssinment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ass11 {

	
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new EdgeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div/input")).sendKeys("test@gmail.com",Keys.TAB,"test@123",Keys.TAB,Keys.TAB,Keys.SPACE);
			
	}

}
