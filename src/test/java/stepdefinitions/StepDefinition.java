package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	String expectedmessage = "Mounika";
	
	public WebDriver driver;
	
	@Given("User is on login page")
	public void step1() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		Thread.sleep(3000);
		
	}
	@When("enter uname as {string} and pword as {string}")
	public void enter_username_as_and_password_as(String uname, String pword) throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pword);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
	    
	}
	
	@Then("check the success message")
	public void step3()
	{
		WebElement successmessage = driver.findElement(By.xpath("//h4[contains(text(),'Welcome to the Secure Area. When you are done click logout below.')]"));
		String convertedsmessage =  successmessage.getText();
		Assert.assertTrue(convertedsmessage.contains(expectedmessage), "Test Case Failed");
	}
}
