package stepdefinitions;


import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks{
	
	WebDriver driver;
	@Before("@Mounika")
	public void beforeScenario()
	{
		System.out.println("Starting point of the scenario");
	}
	
	@After("@Mounika")
	public void afterScenario()
	{
		driver.close();
		System.out.println("Ending point of the scenario");
		
	}

}
