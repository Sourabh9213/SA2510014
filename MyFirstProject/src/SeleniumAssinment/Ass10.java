package SeleniumAssinment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ass10 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[2]/input")).sendKeys("Sourabh Matade");
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[3]/div/input")).sendKeys("Sourabh1311");
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[6]/div/input")).sendKeys("Sour@1311");
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[7]/div/input")).sendKeys("Sour@1311");
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[14]/div/div/input")).sendKeys("Sourabh90@gmail.com");
		
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[17]/div/div/input")).sendKeys("8855885588");
		

	}

}
