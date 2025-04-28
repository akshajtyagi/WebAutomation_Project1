package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.CheckoutPage;

public class CheckoutPageSteps {

	CheckoutPage checkout = new CheckoutPage();

	@And("user enter information {string} {string} {string}")
	public void user_enter_information(String fname, String lname, String pcode) {
		checkout.user_enter_information(fname, lname, pcode);
	}

	@Then("user place order with cash on delivery mode")
	public void user_place_order_with_cash_on_delivery_mode() {
		checkout.userPlaceAnOrder();
	}

	@Then("validate order confirmation")
	public void validate_order_confirmation() {
		checkout.validate_order_confirmation();
	}

}
