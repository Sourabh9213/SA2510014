package com.StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.*;

public class S02GoogleSearch {
	
	WebDriver driver;

	
	@Given("google Open in browser")
	public void google_open_in_browser() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.google.com/");
	}

	@When("Enter the text in search box")
	public void enter_the_text_in_search_box() {
	 driver.findElement(By.name("q")).sendKeys("Sourabh Matade");
	}

	@When("hit enter")
	public void hit_enter() {
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("a valid search result should be displyed")
	public void a_valid_search_result_should_be_displyed() {
		if(driver.getCurrentUrl().contains("")) {
			System.out.println("Contain Search Sussesfully!!!!!");
			
		}


	}

}
