package com.StarAgileAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TricentisVehiclePage {

	WebDriver driver;

	public TricentisVehiclePage(WebDriver driver) {
		this.driver = driver;
	}

	public void Make(String M) {
		WebElement dropdown = driver.findElement(By.id("make"));
		Select MakerName = new Select(dropdown);
		MakerName.selectByVisibleText(M);	
	}	

	public void EnginePerformance(String KW) {
		driver.findElement(By.cssSelector("input[name='[kW]']")).sendKeys(KW);
	}

	public void DateOfManufacture(String DD, String MM, String YYYY) {
		driver.findElement(By.cssSelector("input[id='dateofmanufacture']")).sendKeys(DD + "/" + MM + "/" + YYYY);
	}

	public void NumberOfSeats(String N) {
		WebElement dropdown2 = driver.findElement(By.id("numberofseats"));
		Select SeatNo = new Select(dropdown2);
		SeatNo.selectByVisibleText(N);
			}
	
	public void FuelType(String fuel) {
		WebElement dropdown2 = driver.findElement(By.id("fuel"));
		Select FUEL = new Select(dropdown2);
		List<WebElement> Options = FUEL.getOptions();
		for (int i = 0; i < Options.size(); i++) {
			if (Options.get(i).getText().equals(fuel)) {
				FUEL.selectByIndex(i);
				break;
			}
		}
	}

	public void ListPrice(String Price) {
		driver.findElement(By.id("listprice")).sendKeys(Price);
	}

	public void LicensePlateNo(String NoPlate) {
		driver.findElement(By.xpath("//label[contains(text(),'License Plate Number')]")).sendKeys(NoPlate);
	}

	public void AnnualMileage(String Mileage) {
		driver.findElement(By.xpath("//label[contains(text(),'Annual')]")).sendKeys(Mileage);
	}

}
