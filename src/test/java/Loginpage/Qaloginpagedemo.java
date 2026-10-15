package Loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Qaloginpagedemo extends CommonActions {
	WebDriver driver;
	private WebElement User;
	@Given("User launches the application")
	public void user_launche_the_application() {
	launchApplication("https://www.saucedemo.com/");
			   
	}

	@When("user enters valid credentials")
	public void user_enters_valid_credentials() {
		WebElement username= driver.findElement(By.id("user-name"));
		enterText(username,"standard-user");
		WebElement password= driver.findElement(By.id("password"));
	enterText(username,"secret_sauce");

	}

	@When("user clicks the login button")
	public void user_clicks_the_login_button() {
		WebElement login = driver.findElement(By.id("login-button"));
		click(login);

	    
	}

	@Then("user should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
		String currentUrl =driver.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("inventory"));
		System.out.println("Valid Login Test passed");
		driver.quit();
	   
	}
	
	@When("user enters invalid credentials")
	public void user_enters_invalid_credentials() {
		WebElement user= driver.findElement(By.id("user-name"));
		enterText(user,"standard-user");

		WebElement password= driver.findElement(By.id("password"));
		enterText(password,"standard-user");
		driver.findElement(By.id("login-button")).click();
	}

	@Then("user should be logged in as failed")
	public void user_should_be_logged_in_as_failed() {
		String errorMessage=driver.findElement(By.tagName("h3")).getText();
		 Assert.assertTrue(errorMessage.contains("Username and password do not match"));
			System.out.println("Invalid Login Test passed");
			driver.quit();
	
	}
	

	@When("user enters valid username {string}")
	public void user_enters_valid_username(String username) {
	    WebElement user = driver.findElement(By.id("user-name"));
	    user.sendKeys(username); 
	}

	@When("user enter valid password {string}")
	public void user_enter_valid_password(String password) {
	    WebElement passwordfield = driver.findElement(By.id("password"));
	    passwordfield.sendKeys(password);   
	}





}




