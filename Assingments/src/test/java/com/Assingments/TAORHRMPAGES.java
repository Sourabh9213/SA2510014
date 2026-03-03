package com.Assingments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TAORHRMPAGES {
	private WebDriver driver;
	By Username = By.name("username");
	By Password = By.name("password");
	By SubBtn = By.className("oxd-button");
	By UserDropDown = By.xpath("//p[contains(text(),'user')]/parent::span");
	By LogOutbtn = By.partialLinkText("Logout");
	By PIM = By.xpath("//span[text()='PIM']/parent::a");
	By Adddbtn = By.xpath("//div/div/div[2]/div[2]/div/div[2]/div/button");
	By Fname = By.name("firstName");
	By Mname = By.name("middleName");
	By Lname = By.name("lastName");
	By CLD = By.className("oxd-switch-input");
	By nameUser = By.xpath("//div[3]/div/div/div/div[2]/input[@autocomplete=\"off\"]");
	By PASS = By.xpath("//div[4]/div/div[1]/div/div[2]/input[@autocomplete=\"off\"]");
	By CNFPS = By.xpath("//div[4]/div/div[2]/div/div[2]/input[@autocomplete=\"off\"]");
	By SaveBTN = By.xpath("//button[@type='submit']");
	By DisPlayUser = By.id("");
	By Myinfo = By.partialLinkText("My Info");
	
	public TAORHRMPAGES(WebDriver driver) {
		this.driver = driver;
	}

	public void Login(String UN, String PS) {
		driver.findElement(Username).sendKeys(UN);
		driver.findElement(Password).sendKeys(PS);
		driver.findElement(SubBtn).click();	}

	public void logOut() {
		driver.findElement(UserDropDown).click();
		driver.findElement(LogOutbtn).click();
	}

	public void CreateUser(String FN, String MN, String LN, String un, String ps) {
		driver.findElement(PIM).click();
		driver.findElement(Adddbtn).click();
		driver.findElement(Fname).sendKeys(FN);
		driver.findElement(Mname).sendKeys(MN);
		driver.findElement(Lname).sendKeys(LN);
		driver.findElement(CLD).click();
		driver.findElement(nameUser).sendKeys(un);
		driver.findElement(PASS).sendKeys(ps);
		driver.findElement(CNFPS).sendKeys(ps);
		driver.findElement(SaveBTN).click();
	}
	
	public void UserDetails() {
		String DisUN =driver.findElement(DisPlayUser).getText();
		System.out.println("Currntly Login With > "+DisUN+" < This User");
		driver.findElement(Myinfo).click();
		
	}
	
}
