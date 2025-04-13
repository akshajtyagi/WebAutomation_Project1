package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {

	WebDriver driver;

	@Given("user launch site url")
	public void user_launch_site_url() {

		ChromeOptions options = new ChromeOptions();
		// options.addArguments("--headless");
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize(); 

	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
		userName.sendKeys("standard_user");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
	}

	@And("user click on login button")
	public void user_click_on_login_button() {
		WebElement loginBtn = driver.findElement(By.xpath("//input[@id='login-button']"));
		loginBtn.click();

	}

	@Then("validate user logged in sucessfully")
	public void validate_user_logged_in_sucessfully() {
		String title = driver.getTitle();
		System.out.println("TITLE NAME IS: " + title);
		// Assert.assertEquals("", "Swag Lab");

		driver.quit();

	}

}
