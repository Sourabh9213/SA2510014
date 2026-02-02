package SeleniumAssinment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ass30 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new EdgeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://sampleapp.tricentis.com/101/index.php");
		Robot RBT = new Robot();
		
		
		driver.findElement(By.partialLinkText("Automobile")).click();
		driver.findElement(By.partialLinkText("Insurant ")).click();
		driver.findElement(By.id("open")).click();
		
		for(int i =1 ; i <= 10; i++) {
			Thread.sleep(500);
		RBT.keyPress(KeyEvent.VK_TAB);
		}
		
		Thread.sleep(500);
		RBT.keyPress(KeyEvent.VK_DOWN);
		
		Thread.sleep(500);
		RBT.keyPress(KeyEvent.VK_SPACE);
		
		Thread.sleep(500);
		RBT.keyPress(KeyEvent.VK_TAB);
		
		Thread.sleep(500);
		RBT.keyPress(KeyEvent.VK_SPACE);
		
		Thread.sleep(500);
		RBT.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		
		System.out.println("Test Run A to z");
//		driver.close();
	}

}
