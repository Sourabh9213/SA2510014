package SeleniumAssinment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Ass25 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		String FN = "Sourabh";
		String MN = "SU";
		String SN = "Matade";
		String ID = "19666";
		String un = "Sourabh212";
		String ps = "Sour12645";

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();

		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

		driver.findElement(By.xpath("//a[@href=\"/web/index.php/pim/viewPimModule\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys(FN, Keys.TAB, MN, Keys.TAB, SN,
				Keys.TAB, ID);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/div[1]/label[1]/span[1]"))
				.click();

		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input"))
				.sendKeys(un);

		WebElement Status = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]"));

		if (Status.isEnabled() && Status.isDisplayed()) {
			Status.isSelected();
		}

		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(ps, Keys.TAB, ps);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

		Thread.sleep(2000);
		WebElement Name = driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String text = (String) js.executeScript("return arguments[0].value;", Name);
		System.out.println("here is Value " + text);

		if (text.contains("Sourabh")) {

			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/i")).click();
			driver.findElement(By.partialLinkText("Logout")).click();
		}

		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(ps);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		String USName = driver.findElement(By.xpath("//ul/li[3]/a/span")).getText();
		System.out.println("Url Is Login Throgh this user -> " + USName);

		driver.findElement(By.partialLinkText("My Info")).click();
		WebElement EID = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]"));
		System.out.println("Emplyee ID -->  " + EID.getAttribute("value"));
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//li/span")).click();
		driver.findElement(By.partialLinkText("Logout")).click();

		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		driver.findElement(By.xpath("//li[1]//a/span")).click();
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input"))
				.sendKeys(un);
		driver.findElement(By.xpath("//form/div[2]//button[2]")).click();
		String VerifyName = driver
				.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div[1]/div[2]"))
				.getText();
		System.out.println(VerifyName);

		if (VerifyName.contentEquals(un)) {
			driver.findElement(By.xpath("//div[2]/div/div/button[@type=\"button\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div/div/div[3]/button[2][@type=\"button\"]")).click();
			Thread.sleep(2000);
			System.out.println("User Is sussecfully Deleted");
		}

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/i")).click();
		driver.findElement(By.partialLinkText("Logout")).click();

	}
}