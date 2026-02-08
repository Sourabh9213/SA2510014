package SeleniumAssinment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ass37 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Robot rbt = new Robot();

		driver.get("https://demoqa.com/automation-practice-form");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600);", " ");
		driver.findElement(By.id("firstName")).sendKeys("Sourabh");
		driver.findElement(By.id("lastName")).sendKeys("Matade");
		driver.findElement(By.id("userEmail")).sendKeys("sourabh9213@mail.com");
	

		List<WebElement> Genders = driver.findElements(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div"));
		js.executeScript("window.scrollBy(0,600);", " ");

		String GenderValue = "Male";

		for (WebElement Gen : Genders) {
			if (Gen.getText().equalsIgnoreCase(GenderValue)) {
				Gen.click();
				break;
			}
		}
		driver.findElement(By.id("userNumber")).sendKeys("8989898558");

		driver.findElement(By.id("dateOfBirthInput")).click();
		new Select(driver.findElement(By.cssSelector("select[class$=\"month-select\"]"))).selectByValue("11");
		new Select(driver.findElement(By.cssSelector("select[class$='year-select'")))
				.selectByContainsVisibleText("1991");

		List<WebElement> Date = driver
				.findElements(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div/div"));
		for (WebElement D : Date) {

			if (D.getText().contains("2")) {
				D.click();
				break;
			}
		}
//		WebElement DOB = driver.findElement(By.id("dateOfBirthInput"));
//		DOB.sendKeys(Keys.CONTROL + "a");
//		DOB.sendKeys("02 Dec 1991" + Keys.ENTER);
		


		WebElement Subject = driver.findElement(By.id("subjectsInput"));
		js.executeScript("arguments[0].scrollIntoView(true);", Subject);
		
		Subject.sendKeys("a");		
		driver.findElement(By.id("react-select-2-option-0")).click();

		List<WebElement> Hobies = driver.findElements(By.xpath("//div[@id=\"hobbiesWrapper\"]/div[2]/div/label"));

		for (WebElement H : Hobies) {
			if (H.getText().contains("Sport") && H.isEnabled() && H.isSelected() == false) {
				H.click();
			}
			if (H.getText().contains("Music") && H.isEnabled() && H.isSelected() == false) {
				H.click();
			}}

			Actions act = new Actions(driver);
			WebElement UploadPic = driver.findElement(By.id("uploadPicture"));
			act.click(UploadPic).perform();

			rbt.keyPress(KeyEvent.VK_SHIFT);
			Thread.sleep(700);

			rbt.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(700);

			rbt.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(700);

			rbt.keyRelease(KeyEvent.VK_TAB);
			rbt.keyRelease(KeyEvent.VK_SHIFT);

			rbt.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(700);

			rbt.keyPress(KeyEvent.VK_SPACE);
			Thread.sleep(700);

			rbt.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(700);

			rbt.keyPress(KeyEvent.VK_SPACE);
			Thread.sleep(700);

			rbt.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(700);

			js.executeScript("window.scrollBy(0,500);", " ");

			driver.findElement(By.cssSelector("textarea[placeholder^=\"Current\"]")).sendKeys("Navi Mumbai");			
			
			WebElement State = driver.findElement(By.id("react-select-3-input"));
			js.executeScript("arguments[0].scrollIntoView(true)", State);
			State.sendKeys("NCR" + Keys.ENTER);
			
			WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10));
			WebElement City = driver.findElement(By.id("react-select-4-input"));
			wait.until(ExpectedConditions.elementToBeClickable(City));
			City.sendKeys(Keys.ARROW_DOWN , Keys.ENTER);
			
			driver.findElement(By.id("submit")).submit();
			String AfterSubmitMsg = driver.findElement(By.id("example-modal-sizes-title-lg")).getText();
			if(AfterSubmitMsg.contains("Thanks for")) {
				System.out.println("!!!!!!Bingo!!!!!!");
				System.out.println("Your Registration Form is Sussesfully Submited");
				
			}else {
				System.out.println("XXXX Your Code or Test Failed XXXX");
			}
			
			driver.close();


		}

	}