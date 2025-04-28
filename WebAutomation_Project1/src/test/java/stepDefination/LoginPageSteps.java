package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginPageSteps {

	LoginPage login = new LoginPage();

	@Given("user launch site url")
	public void user_launch_site_url() {
		login.user_launch_site_url();
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		login.user_enter_username_and_password();
	}

	@And("user click on login button")
	public void user_click_on_login_button() {
		login.user_click_on_login_button();
	}

	@Then("validate user logged in sucessfully")
	public void validate_user_logged_in_sucessfully() {
		login.validate_user_logged_in_sucessfully();
	}
}
