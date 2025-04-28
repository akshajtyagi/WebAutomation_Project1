package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class CheckoutPage extends Base {

	public void user_enter_information(String fname, String lname, String pcode) {

		WebElement firstName = driver.findElement(By.cssSelector("input#first-name"));
		firstName.sendKeys(fname);

		WebElement lastName = driver.findElement(By.cssSelector("input#last-name"));
		lastName.sendKeys(lname);

		WebElement postalCode = driver.findElement(By.cssSelector("input#postal-code"));
		postalCode.sendKeys(pcode);

	}

	public void userPlaceAnOrder() {
		WebElement continueBtn = driver.findElement(By.cssSelector("input#continue"));
		continueBtn.click();

		WebElement finishBtn = driver.findElement(By.cssSelector("button#finish"));
		finishBtn.click();

	}

	public void validate_order_confirmation() {
		WebElement confirmationText = driver.findElement(By.cssSelector("h2.complete-header"));
		String orderConfirmation = confirmationText.getText();
		Assert.assertEquals("Thank you for your order!", orderConfirmation);
		tearDown();
	}

}
