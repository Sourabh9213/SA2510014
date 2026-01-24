package SeleniumAssinment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass01 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://staragile.melimu.com/mod/resource/view.php?id=29377");
		System.out.println(driver.getPageSource());
		driver.close();

	}

}
