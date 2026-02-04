package com.StepDefinition;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.cucumber.java.en.*;

public class S01GoogleTitle {
	WebDriver driver;
	String CapTitle;

	@Given("Open Google")
	public void open_google() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.google.com/");
	}

	@When("Capture the title")
	public void capture_the_title() {
		CapTitle = driver.getTitle();
	}

	@Then("title should be Google")
	public void title_should_be_google() {
		if (CapTitle.contains("Google")) {
			System.out.println("Title Verifyed!!!!");

		}
	}

}
