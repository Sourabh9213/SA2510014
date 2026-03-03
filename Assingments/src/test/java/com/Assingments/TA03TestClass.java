package com.Assingments;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TA03TestClass extends TAss03BaseClass {

	TAORHRMPAGES page;

	@BeforeClass
	public void init() {
		page = new TAORHRMPAGES(driver);
	}

	@Test(priority = 1)
	public void adminLogIn() {

		page.Login("admin", "admin123");
	}

	@Test(priority = 2, dependsOnMethods = "adminLogIn")
	public void createnewUser() {

		page.CreateUser("Sourabh", "s", "Matade", "sourabh9797", "Sourabh@9213");
	}

	@Test(priority = 3, dependsOnMethods = "createnewUser")
	public void logOut(){
		page.logOut();		
	}
	
	
	@Test(priority = 4, dependsOnMethods = "logOut")
	public void LogInViaNewUser() {
		
		page.Login("sourabh9797", "Sourabh@9213");
		
	}
}
