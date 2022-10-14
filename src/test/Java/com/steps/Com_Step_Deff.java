package com.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.DriverUtils_Base.Base; 
public class Com_Step_Deff {
	WebDriver driver;
	@Given("user navigates to application url")
	public void user_navigates_to_application_url() {

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    
	}
	@When("user enters usename and password")
	public void user_enters_usename_and_password() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("user");
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("123");
	    
	}
	@Then("user clicks login button")
	public void user_clicks_login_button() {
		driver.findElement(By.name("login")).click();
		driver.manage().window().maximize();

	}


}
