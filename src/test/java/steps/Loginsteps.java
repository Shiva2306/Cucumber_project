package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginsteps {

	WebDriver driver;
	
	@Given("User opens chrome browser and enters facebook url")
	public void user_opens_chrome_browser_and_enters_facebook_url() {
	    
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		
		
	}

	@When("user enters email ID and password")
	public void user_enters_email_id_and_password() {
	   
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Hello123");
	}

	@When("clicks on submit button")
	public void clicks_on_submit_button() {
	    
		driver.findElement(By.id("loginbutton")).click();
	}

	@Then("a confirmation message should be displayed")
	public void a_confirmation_message_should_be_displayed() {
	    
		System.out.println("Confirmation message is displayed");
	}



}
