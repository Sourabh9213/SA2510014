package com.StepDefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S03SeleniumAss {
	
	WebDriver driver;
	
	@Given("Open Selenium")
	public void open_selenium() {
		driver = new EdgeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	 
	}

	@When("Click On Downloads")
	public void click_on_downloads() {
	    driver.findElement(By.linkText("Downloads"));
	    }

	@Then("Validation For Downloads")
	public void validation_for_downloads() {
	    String Downloads = driver.getTitle();
	    Assert.assertTrue(Downloads.contains("Downloads"));		
	    System.out.println("Your Downloads Test Is Failed");
	    }

	@When("Click On Documentations")
	public void click_on_documentations() {
		 driver.findElement(By.linkText("Documentation"));
	}

	@Then("Validations For Documentaions")
	public void validations_for_documentaions() {
	driver.findElement(By.linkText("Documentaions"));
	}

	@When("Click On Projects")
	public void click_on_projects() {
		 driver.findElement(By.linkText("Projects"));
	}

	@Then("Validations For Projects")
	public void validations_for_projects() {
		String Projects = driver.getTitle();
	    Assert.assertTrue(Projects.contains("Projects"));		
	    System.out.println("Your Projects Test Is Failed");
	}

	@When("Click On Support")
	public void click_on_support() {
		 driver.findElement(By.linkText("Support"));
	}

	@Then("Validations For Support")
	public void validations_for_support() {
		   String Support = driver.getTitle();
		    Assert.assertTrue(Support.contains("Support"));		
		    System.out.println("Your Support Test Is Failed");
	}

}
