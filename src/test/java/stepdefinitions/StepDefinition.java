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
	
	String expectedmessage = "Welcome";
	
	public WebDriver driver;
	
	@Given("launch the webdriver")
	public void launch_the_webdriver() {
	    driver = new ChromeDriver();
	}
	
	@Given("User is on login page")
	public void step1forscenario1() throws InterruptedException
	{
		
		driver.get("https://the-internet.herokuapp.com/login");
		Thread.sleep(3000);
		
	}
//	@When("^enter usernamefield as (.+) and passwordwordfield as (.+)$")
//	public void enter_usernamefield_as_mounika_and_passwordwordfield_as(String a, String b) throws InterruptedException {
//		driver.findElement(By.id("username")).sendKeys(a);
//		driver.findElement(By.id("password")).sendKeys(b);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(3000);
//		
//	   
//	}
	
	@When("enter uname as {string} and pword as {string}")
	public void step2forscenario1(String uname, String pword) throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pword);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
	    
	}
	
	
	@Then("check the success message")
	public void step3forscenario1()
	{
		WebElement successmessage = driver.findElement(By.xpath("//h4[contains(text(),'Welcome to the Secure Area. When you are done click logout below.')]"));
		String convertedsmessage =  successmessage.getText();
		Assert.assertTrue(convertedsmessage.contains(expectedmessage), "Test Case Failed");
	}

	
	
}
