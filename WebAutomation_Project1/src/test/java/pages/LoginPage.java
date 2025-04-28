package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class LoginPage extends Base {

	public void user_launch_site_url() {
		setup();
		System.out.println("url");
	}

	public void user_enter_username_and_password() {
		System.out.println("username & password");
		WebElement userName = driver.findElement(By.cssSelector("input#user-name"));
		userName.sendKeys("standard_user");
		WebElement password = driver.findElement(By.cssSelector("[name='password']"));
		password.sendKeys("secret_sauce");
	}

	public void user_click_on_login_button() {
		System.out.println("login button");
		WebElement loginBtn = driver.findElement(By.cssSelector("input#login-button"));

		loginBtn.click();
	}

	public void validate_user_logged_in_sucessfully() {
		System.out.println("loggedin sucessfull");
		tearDown();
	}
}
